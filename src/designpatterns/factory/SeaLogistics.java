package designpatterns.factory;

public class SeaLogistics implements Logistics {

	Transport transport;
	
	private void delivery() {
		// TODO Auto-generated method stub
		System.out.println(transport.deliver());
	}

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		transport = new Ship();
		delivery();
		return transport;
	}

}
