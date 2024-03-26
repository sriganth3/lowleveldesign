package designpatterns.behavioral.templatemethod;

public class ConcreteHouseBuilder  extends HouseBuilder{

	@Override
	protected void paintHouse() {
		System.out.println("Painting The Concrete House");
	}

	@Override
	protected void buildRoof() {
		System.out.println("Building Concrete Roof");
	}

	@Override
	protected void buildWalls() {
		System.out.println("Building Concrete Wall");
		
	}

	@Override
	protected void buildFoundation() {
		System.out.println("Building Concrete Foundation");
	}

}
