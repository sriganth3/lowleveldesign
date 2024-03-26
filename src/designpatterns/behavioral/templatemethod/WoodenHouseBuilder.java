package designpatterns.behavioral.templatemethod;

public class WoodenHouseBuilder  extends HouseBuilder{

	@Override
	protected void paintHouse() {
		System.out.println("Painting The Wooden House");
	}

	@Override
	protected void buildRoof() {
		System.out.println("Building Wooden Roof");
	}

	@Override
	protected void buildWalls() {
		System.out.println("Building Wooden Wall");
		
	}

	@Override
	protected void buildFoundation() {
		System.out.println("Building Wooden Foundation");
	}

}
