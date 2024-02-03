package designpatterns.factory;

public class SeaLogistics implements Logistics {

	Transport transport;
	
	private void delivery() {
		
		System.out.println(transport.deliver());
	}

	@Override
	public Transport createTransport() {
		
		transport = new Ship();
		delivery();
		return transport;
	}

}
