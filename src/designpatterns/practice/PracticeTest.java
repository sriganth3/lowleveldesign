package designpatterns.practice;

import designpatterns.practice.adapter1.AV;
import designpatterns.practice.adapter1.AudioPlayer;
import designpatterns.practice.adapter1.AudioPlayerAdapter;
import designpatterns.practice.adapter1.MP3;
import designpatterns.practice.adapter1.MP4;
import designpatterns.practice.builder1.Meal;
import designpatterns.practice.builder1.MealConcreteBuilder;
import designpatterns.practice.decorator1.BoldDecorator;
import designpatterns.practice.decorator1.ItalicDecorator;
import designpatterns.practice.decorator1.PlainText;
import designpatterns.practice.decorator1.Text;
import designpatterns.practice.decorator1.TextDecorator;
import designpatterns.practice.decorator2.Bevarage;
import designpatterns.practice.decorator2.CaramelDecorator;
import designpatterns.practice.decorator2.Espresso;
import designpatterns.practice.decorator2.MilkDecorator;
import designpatterns.practice.factorymethod1.BikeFactory;
import designpatterns.practice.factorymethod1.CarFactory;
import designpatterns.practice.factorymethod1.MotorCycleFactory;
import designpatterns.practice.factorymethod1.Vehicle;
import designpatterns.practice.factorymethod1.VehicleFactory;
import designpatterns.practice.factorymethod2.EmailFactory;
import designpatterns.practice.factorymethod2.Notification;
import designpatterns.practice.factorymethod2.NotificationFactory;
import designpatterns.practice.factorymethod2.PushNotificationFactory;
import designpatterns.practice.factorymethod2.SMSFactory;
import designpatterns.practice.prototype1.ReportTemplate;
import designpatterns.practice.singleton1.DatabaseConnectionManager;
import designpatterns.practice.singleton2.LogManager;

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


		/**
		 * Problem Statement:
		 * You are tasked with designing a system to create complex meal orders in a restaurant 
		 * where customers can customize their meals by selecting different components such as 
		 * a main course, side dish, drink, dessert, and optional add-ons. 
		 * 
		 * Objective:
		 * Implement the Builder Pattern to allow clients to construct a customizable meal 
		 * with various components and optional add-ons, while keeping the meal creation process 
		 * abstract and flexible.
		 */


		MealConcreteBuilder mealBuilder = new MealConcreteBuilder("Pizza");
		Meal meal = mealBuilder.addAddOns("Cheese")
				.addDessert("Ice Cream")
				.addAddOns("Olives")
				.addSideDish("Garlic Bread")
				.addDrinks("Coke").build();
		System.out.println(meal);


		/**
		 * Problem Statement:
		 * You are tasked with developing a report generation system where different teams in an organization
		 * need to create reports based on a standardized template. However, each team may customize the content
		 * and headers of their reports. The system should ensure that a common template is maintained and 
		 * can be used to create copies for customization without affecting the original template.
		 * 
		 * Objective:
		 * Implement the Prototype Pattern to allow teams to clone a common `ReportTemplate` and make 
		 * modifications to it, such as changing the report content and headers. The system should ensure 
		 * that the original template remains unmodified, even as various teams create customized versions.
		 */


		ReportTemplate template = ReportTemplate.getInstance();

		ReportTemplate clonedReport = template.clone();
		System.out.println(template.equals(clonedReport));
		clonedReport.setContent("New Content");
		clonedReport.setHeader("2024 Report");

		System.out.println(template.equals(clonedReport));
		System.out.println(template);
		System.out.println(clonedReport);


		/*
		 * Problem Statement:
		 * In a text processing application, there are various audio formats such as MP3 and MP4.
		 * The existing audio player only supports MP3 files and does not recognize MP4 files,
		 * which include both audio and video data. To enhance the application's functionality
		 * and allow it to handle different audio formats seamlessly, we can use the Adapter Pattern.
		 *
		 * The objective is to create an adapter that converts MP4 audio into a format compatible 
		 * with the existing MP3 audio player. This will allow the audio player to play both MP3 
		 * and MP4 audio files without modifying its existing functionality.
		 */

		MP3 mp3 = new MP3("Song.mp3", "MP3 Audio Data");

		AV av = new AV("MP4 Audio Data", "MP4 Video Data");
		MP4 mp4 = new MP4("Video.mp4", av);

		AudioPlayer audioPlayer = new AudioPlayer();


		audioPlayer.play(mp3);

		AudioPlayerAdapter adapter = new AudioPlayerAdapter();

		MP3 convertedMP4 = adapter.convertToMP3(mp4);
		audioPlayer.play(convertedMP4);


		/*
		 * Problem Statement:
		 *
		 * In a text processing application, we want to enhance the formatting of text without
		 * altering the original text components. The application supports various text styles,
		 * and we aim to implement a flexible way to combine these styles dynamically.
		 *
		 * The objective is to use the Decorator Pattern to allow text components (like plain text)
		 * to be wrapped with additional behavior (like bold, italic, or underline) without modifying
		 * the existing text classes. This will enable users to create rich text formats by stacking
		 * multiple decorators, providing a more versatile and maintainable way to manage text formatting.
		 */

		Text text = new PlainText("New Text");
		System.out.println(text.format());

		TextDecorator italicText = new ItalicDecorator(text);
		System.out.println(italicText.format());

		TextDecorator boldItalicText = new BoldDecorator(italicText);
		System.out.println(boldItalicText.format());


		/*
		 * Problem Statement:
		 * In a coffee shop system, we want to dynamically create beverage orders by allowing customers to add
		 * various ingredients (like milk, caramel, whipped cream, etc.) to their basic drinks (such as espresso, latte, etc.).
		 *
		 * The challenge is to add new ingredients to beverages without altering the base classes of the drinks.
		 * We want a flexible design where multiple ingredients can be combined, with each ingredient adding its own 
		 * cost and modifying the description of the beverage.
		 *
		 * The solution is to use the Decorator Pattern, where each additional ingredient is implemented as a decorator,
		 * wrapping the base beverage object, allowing the user to compose different drink combinations dynamically.
		 */


		Bevarage beverage = new Espresso();
		beverage = new MilkDecorator(beverage); // Add Milk
		beverage = new CaramelDecorator(beverage); // Add Caramel
		System.out.println("Bevarage ingredients: " + beverage.getIngredients() + " - Cost: $" + beverage.cost());


	}
}
