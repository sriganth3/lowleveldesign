package designpatterns;

import designpatterns.abstractfactory.Gadget;
import designpatterns.abstractfactory.ConcreteMobileFactory;
import designpatterns.abstractfactory.ConcreteLaptopFactory;
import designpatterns.abstractfactory.GadgetFactory;
import designpatterns.builder.Car;
import designpatterns.builder.CarBuilder;
import designpatterns.builder.CarConcreteBuilder;
import designpatterns.factory.Logistics;
import designpatterns.factory.LogisticsFactory;
import designpatterns.factory.Transport;
import designpatterns.singleton.Singleton;

public class Test {

	public static void main(String[] args) {
		
		
		//Factory Design Pattern
		callFactory("sea");
		callFactory("road");
		callFactory("air");
		
		//Abstract Factory Design Pattern
		callAbstractFactory();
		
		//Builder Design Pattern
		callBuilder();
		
		//Singleton Design Pattern
		callSingleton();
		
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

}
