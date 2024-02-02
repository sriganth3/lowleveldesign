package designpatterns.factory;

public class Truck implements Transport {
	
	private String transport = "Truck"; 
	private String delivery = "Delivering the logistics by land";

	@Override
	public String deliver() {
		// TODO Auto-generated method stub
		return delivery;
	}

	@Override
	public String getTransport() {
		// TODO Auto-generated method stub
		return transport;
	}

}
