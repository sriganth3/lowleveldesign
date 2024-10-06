package practice.factorymethod1;

public class MotorCycleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		
		return new MotorCycle();
	}

}
