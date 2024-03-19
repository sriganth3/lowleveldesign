package designpatterns.behavioral.iterator;

import java.util.List;

public class TreasureChest {

	private List<Item> items = List.of(new Item("Healing Potion", ItemType.POTION),
			new Item("Lightning Potion", ItemType.POTION),
			new Item("Ring of Light", ItemType.RING),
			new Item("Dagger with Poison", ItemType.WEAPON),
			new Item("Earthquack Potion", ItemType.POTION),
			new Item("Ring of Shadows", ItemType.RING),
			new Item("Sliver Sword", ItemType.WEAPON));

	public List<Item> getItems() {
		return items;
	}
	
	public Iterator<Item> iterator(ItemType type){
		return new TreasureChestIterator(this, type);
	}
	
}
