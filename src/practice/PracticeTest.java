package practice;

import practice.factorymethod1.BikeFactory;
import practice.factorymethod1.VehicleFactory;
import practice.factorymethod1.CarFactory;
import practice.factorymethod1.MotorCycleFactory;
import practice.factorymethod1.Vehicle;


/**
 * Problem Statement and Comments added by GPT
 */
public class PracticeTest {

	public static void main(String[] arg) {

		/**
		 * Problem Statement
		 * You are tasked with designing a vehicle production system for a large automobile manufacturer. 
		 * The system needs to create different types of vehicles (Car, Bike, MotorCycle) without changing 
		 * the core production logic. The system should allow for easy extension to produce new types of 
		 * vehicles in the future.
		 * 
		 * The vehicle creation process should be abstracted so that client code doesn't need to know 
		 * which specific vehicle class it is dealing with, ensuring flexibility and scalability.
		 * 
		 * Objective:
		 * Use the Factory Method Pattern to create different vehicle types by utilizing their respective 
		 * factories, while keeping the client code unaware of the specific implementations.
		 */

		// Create factory objects for different types of vehicles
		VehicleFactory carFactory = new CarFactory();
		VehicleFactory bikeFactory = new BikeFactory();
		VehicleFactory motorCycleFactory = new MotorCycleFactory();

		// Create vehicle objects using their respective factories
		Vehicle car = carFactory.createVehicle();
		Vehicle bike = bikeFactory.createVehicle();
		Vehicle motorCycle = motorCycleFactory.createVehicle();

		// Output the type of each vehicle
		System.out.println(car.getType());        // Output: Car
		System.out.println(bike.getType());       // Output: Bike
		System.out.println(motorCycle.getType()); // Output: MotorCycle
	}
}
