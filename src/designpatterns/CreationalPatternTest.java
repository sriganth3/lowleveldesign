package designpatterns;

import designpatterns.creational.abstractfactory.Gadget;
import designpatterns.creational.abstractfactory.ConcreteMobileFactory;
import designpatterns.common.Utils;
import designpatterns.creational.abstractfactory.ConcreteLaptopFactory;
import designpatterns.creational.abstractfactory.GadgetFactory;
import designpatterns.creational.builder.Car;
import designpatterns.creational.builder.CarBuilder;
import designpatterns.creational.builder.CarConcreteBuilder;
import designpatterns.creational.factory.Logistics;
import designpatterns.creational.factory.LogisticsFactory;
import designpatterns.creational.factory.Transport;
import designpatterns.creational.prototype.Circle;
import designpatterns.creational.singleton.Singleton;

public class CreationalPatternTest {

	public static void main(String[] args) {
		
		
		//Factory Design Pattern
		Utils.header("Factory Design Pattern");
		callFactory("sea");
		callFactory("road");
		callFactory("air");
		
		//Abstract Factory Design Pattern
		Utils.header("Abstract Factory Design Pattern");
		callAbstractFactory();
		
		//Builder Design Pattern
		Utils.header("Builder Design Pattern");
		callBuilder();
		
		//Singleton Design Pattern
		Utils.header("Singleton Design Pattern");
		callSingleton();
		
		//Prototype Design Pattern
		Utils.header("Prototype Design Pattern");
		callProtoType();
	}


	/*
	 * Factory Design Pattern
	 * 
	 */
	public static void callFactory(String mode) {
		
		LogisticsFactory factory = new LogisticsFactory();
		try {
			Logistics logistics = factory.createLogistics(mode);
			Transport transport = logistics.createTransport();
			System.out.println("transport: " + transport.getTransport());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	/*
	 * Abstract Factory Design Pattern
	 * 
	 */
	private static void callAbstractFactory() {
		
        GadgetFactory phoneFactory = new ConcreteMobileFactory();
     
        Gadget phone = phoneFactory.createGadget("iPhone 13");
        System.out.println("Type: " + phone.getType() + ", Model: " + phone.getModel());
        
        GadgetFactory laptopFactory = new ConcreteLaptopFactory();

        Gadget laptop = laptopFactory.createGadget("MacBook Pro");
        System.out.println("Type: " + laptop.getType() + ", Model: " + laptop.getModel());

	}
	
	/*
	 * Builder Design Pattern
	 * 
	 */
	private static void callBuilder() {
		
		CarBuilder builder = new CarConcreteBuilder(); 
		Car newCar = builder.setEngine("Hybrid").setSeats(5).setChassis("Red").setGPS().setTripComputer("Complex").build();
		
		System.out.println(newCar.toString());		
		
		builder = new CarConcreteBuilder(); 
		Car oldCar = builder.setEngine("Internal Combustion Engine").setSeats(7).setChassis("Blue").setTripComputer("Basic").build();
		
		System.out.println(oldCar.toString());
		
	}
	
	/*
	 *  Singleton Design Pattern
	 * 
	 */
	private static void callSingleton() {
		
		Singleton firstInstance = Singleton.getInstance();
		System.out.println("Singleton first instance - "+ firstInstance.toString() +" created around" + Singleton.value);
		
		Singleton secondInstance = Singleton.getInstance();
		System.out.println("Singleton second instance - "+ secondInstance.toString() +" created around" + Singleton.value);
		
	}
	
	/*
	 * Prototype Design Pattern
	 * 
	 */
	private static void callProtoType() {
		
		Circle circle = new Circle();
		circle.color = "Red";
		circle.x = 5;
		circle.y = 6;
		circle.radius = 10;
		
		Circle anotherCircle = (Circle) circle.clone();
		
		validateClone(circle, circle);
		
		validateClone(circle, anotherCircle);
		
		anotherCircle.color = "Blue";
		validateClone(circle, anotherCircle);
	}


	private static void validateClone(Circle circle, Circle anotherCircle) {
		if(circle == anotherCircle) {
			System.out.println("Objects are same");
		}
		else if(circle.equals(anotherCircle)) {
			System.out.println("Objects are different and identical");
		}else {
			System.out.println("Object are different and not identical");
		}
	}
	
	
}
