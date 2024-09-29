package practice;

import practice.factorymethod1.BikeFactory;
import practice.factorymethod1.VehicleFactory;
import practice.factorymethod1.CarFactory;
import practice.factorymethod1.MotorCycleFactory;
import practice.factorymethod1.Vehicle;
import practice.factorymethod2.EmailFactory;
import practice.factorymethod2.Notification;
import practice.factorymethod2.NotificationFactory;
import practice.factorymethod2.PushNotificationFactory;
import practice.factorymethod2.SMSFactory;
import practice.singleton1.DatabaseConnectionManager;
import practice.singleton2.LogManager;


/**
 * Problem Statement and Comments added by GPT
 */
public class PracticeTest {

	public static void main(String[] arg) {

		/**
		 * Problem Statement:
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


		/**
		 * Problem Statement:
		 * You are required to create a notification system that can send various types of notifications such as 
		 * SMS, Email, and Push Notification. Each notification type has a different message format but needs to 
		 * be handled in a uniform way by the client code. The system should be easily extendable to support new 
		 * types of notifications in the future.
		 * 
		 * Objective:
		 * Use the Factory Method Pattern to create different types of notifications using specific factories, 
		 * ensuring that the client code is abstracted from the exact implementation of each notification type.
		 */


		// Notification System

		// Create factory objects for different types of notifications
		NotificationFactory smsFactory = new SMSFactory();
		NotificationFactory emailFactory = new EmailFactory();
		NotificationFactory pushNotificationFactory = new PushNotificationFactory();

		// Create notification objects using their respective factories
		Notification sms = smsFactory.createNotification("This is an SMS notification");
		Notification email = emailFactory.createNotification("This is an Email notification");
		Notification pushNotification = pushNotificationFactory.createNotification("This is a Push notification");

		// Output the message and type of each notification
		// The client can handle each notification uniformly without worrying about the specific notification type
		System.out.println("Message: " + sms.getMessage() + " | Received Type: " + sms.getType());               // Output: SMS message and type
		System.out.println("Message: " + email.getMessage() + " | Received Type: " + email.getType());           // Output: Email message and type
		System.out.println("Message: " + pushNotification.getMessage() + " | Received Type: " + pushNotification.getType()); // Output: Push Notification message and type 

		
		 /**
	     * Problem Statement:
	     * You need to manage a database connection in an application that can only 
	     * have a single instance of the connection manager. This ensures that all 
	     * parts of the application use the same database connection and prevents 
	     * resource conflicts. Implement the Singleton pattern to achieve this.
	     */
		
		DatabaseConnectionManager instance1 = DatabaseConnectionManager.getInstance();
		DatabaseConnectionManager instance2 = DatabaseConnectionManager.getInstance();
		
		System.out.println(instance1 == instance2); // Output: true
		instance1.connect(); // Output: Successfully connected to the database.
		instance1.disconnect(); // Output: Successfully disconnected from the database.
		
		/**
		 * Problem Statement:
	     * The application requires a centralized logging system that allows 
	     * tracking of various events and errors throughout the application. 
	     * Implement a Singleton pattern for the logging mechanism to ensure that 
	     * all log messages are handled consistently from a single instance.
		 */
		
		LogManager logger = LogManager.getLoggerInstance(); 
		logger.info("Using Logging As Singleton Example"); // Output: INFO [practice.PracticeTest]: Using Logging As Singleton Example
		
		
	}
}
