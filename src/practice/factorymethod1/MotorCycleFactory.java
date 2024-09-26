package practice.factorymethod1;

public class MotorCycleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new MotorCycle();
	}

}
