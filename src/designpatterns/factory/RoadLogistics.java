package designpatterns.factory;

public class RoadLogistics implements Logistics{

	Transport transport;
	private void delivery() {
		
		System.out.println(transport.deliver());
	}

	@Override
	public Transport createTransport() {
		
		transport = new Truck();
		delivery();
		return transport;
	}

}
