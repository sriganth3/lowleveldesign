package designpatterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class AlchemistShop {

	List<Potion> topShelf;
	List<Potion> bottomShelf;
	
	PotionFactory factory;
	
	public AlchemistShop() {
		factory = new PotionFactory();
		topShelf = Arrays.asList(new Potion[] {factory.createPotion(PotionType.HEALING),
				factory.createPotion(PotionType.HEALING),
				factory.createPotion(PotionType.HEALING),
				factory.createPotion(PotionType.INVISIBILITY),
				factory.createPotion(PotionType.INVISIBILITY),
				factory.createPotion(PotionType.STRENGTH),
				factory.createPotion(PotionType.HEALING),
				factory.createPotion(PotionType.STRENGTH)});
		
		bottomShelf = Arrays.asList(new Potion[] {factory.createPotion(PotionType.HOLY_WATER),
				factory.createPotion(PotionType.HOLY_WATER),
				factory.createPotion(PotionType.HOLY_WATER),
				factory.createPotion(PotionType.POISON),
				factory.createPotion(PotionType.POISON),
				factory.createPotion(PotionType.HOLY_WATER),
				factory.createPotion(PotionType.HOLY_WATER),
				factory.createPotion(PotionType.HOLY_WATER)});
	}
	
	public void drinkPotions() {
		System.out.println("drinking from top shelf");
		topShelf.forEach(Potion::drink);
		System.out.println("drinking from bottom shelf");
		bottomShelf.forEach(Potion::drink);
	}
	
	
}
