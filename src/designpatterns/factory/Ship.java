package designpatterns.factory;

public class Ship implements Transport {

	private String transport = "Ship";
	private String delivery = "Delivering the logistics by ship";
	
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
