package designpatterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {

	Map<PotionType, Potion> map;
	
	public PotionFactory(){
		map = new EnumMap<>(PotionType.class);
	}
	
	public Potion createPotion(PotionType type) {
		Potion potion = map.get(type);
		if(potion != null) {
			return potion;
		}
		
		switch(type) {
		case HEALING -> potion = new HealingPotion();
		case HOLY_WATER -> potion = new HolyWaterPotion();
		case INVISIBILITY -> potion = new InvisibilityPotion();
		case POISON -> potion = new PoisonPotion();
		case STRENGTH -> potion = new StrengthPotion();
		default ->{
			
		}
		}
		
		map.put(type, potion);
		
		return potion;
	}
}
