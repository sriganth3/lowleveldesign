package designpatterns.creational.factory;

public class Truck implements Transport {
	
	private String transport = "Truck"; 
	private String delivery = "Delivering the logistics by land";

	@Override
	public String deliver() {
		
		return delivery;
	}

	@Override
	public String getTransport() {
		
		return transport;
	}

}
