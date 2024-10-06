package designpatterns.practice.factorymethod1;

public class CarFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		
		return new Car();
	}

}
