package designpatterns.behavioral.iterator;

public class TreasureChestIterator implements Iterator<Item> {

	private int index = -1;
	
	private final TreasureChest chest;
	
	private final ItemType type;
	
	
	
	public TreasureChestIterator(TreasureChest chest, ItemType type) {
		this.chest = chest;
		this.type = type;
		
	}
	
	@Override
	public boolean hasNext() {
		return findIndex() != -1;
	}

	private int findIndex() {
		int tempIndex = index;
		var items = chest.getItems();
		while(true) {
			tempIndex++;
			if(tempIndex >= items.size()) {
				return -1;
			}
			
			if(type == ItemType.ANY || items.get(tempIndex).getType() == type) {
				break;
			}
		}
		
		return tempIndex;
	}

	@Override
	public Item next() {
		index = findIndex();
		if(index != -1) {
			return chest.getItems().get(index);
		}
		return null;
	}

}
