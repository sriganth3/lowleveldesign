package practice.factorymethod1;

public class BikeFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		
		return new Bike();
	}

}
