package designpatterns;

import designpatterns.factory.Logistics;
import designpatterns.factory.LogisticsFactory;
import designpatterns.factory.Transport;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callFactory("sea");
		callFactory("road");
		callFactory("air");
		
		
	}
	
	public static void callFactory(String mode) {
		LogisticsFactory factory = new LogisticsFactory();
		try {
			Logistics logistics = factory.createLogistics(mode);
			Transport transport = logistics.createTransport();
			System.out.println("transport: " + transport.getTransport());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
