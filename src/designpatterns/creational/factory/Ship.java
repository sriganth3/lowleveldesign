package designpatterns.creational.factory;

public class Ship implements Transport {

	private String transport = "Ship";
	private String delivery = "Delivering the logistics by ship";
	
	@Override
	public String deliver() {
		
		return delivery;
	}

	@Override
	public String getTransport() {
		
		return transport;
	}

}
