package designpatterns;

import designpatterns.abstractfactory.Gadget;
import designpatterns.abstractfactory.ConcreteMobileFactory;
import designpatterns.abstractfactory.ConcreteLaptopFactory;
import designpatterns.abstractfactory.GadgetFactory;
import designpatterns.factory.Logistics;
import designpatterns.factory.LogisticsFactory;
import designpatterns.factory.Transport;

public class Test {

	public static void main(String[] args) {
		
		
		//Factory Design Pattern
		callFactory("sea");
		callFactory("road");
		callFactory("air");
		
		//Abstract Factory Design Pattern
		callAbstractFactory();
		
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

}
