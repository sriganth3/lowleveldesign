package designpatterns.creational.builder;

public class CarConcreteBuilder implements CarBuilder{
	
	protected int numberOfSeats;
	protected String engineType;
	protected String color;
	protected boolean gps;
	protected String tripComputer;

	@Override
	public CarBuilder setSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
		return this;
	}

	@Override
	public CarBuilder setEngine(String engineType) {
		this.engineType = engineType; 
		return this;
	}

	@Override
	public CarBuilder setChassis(String color) {
		this.color = color;
		return this;
	}

	@Override
	public CarBuilder setGPS() {
		this.gps = true;
		return this;
	}

	@Override
	public CarBuilder setTripComputer(String type) {
		this.tripComputer = type;
		return this;
	}
	
	public Car build() {
		return new Car(this);
	}

	

}
