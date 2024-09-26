package practice.factorymethod1;

public class BikeFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}
