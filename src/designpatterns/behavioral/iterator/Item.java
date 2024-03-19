package designpatterns.behavioral.iterator;

public class Item {

	private String name;
	
	private ItemType type;

	public Item(String name, ItemType type) {
		super();
		setName(name);
		setType(type);
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
