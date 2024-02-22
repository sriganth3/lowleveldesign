package designpatterns.creational.builder;

public class Car {

	// Required
	public int numberOfSeats;
	public String engineType;
	
	// Optional
	public String color;
	public boolean gps;
	public String tripComputer;
	
	protected Car(CarConcreteBuilder builder) {
		this.numberOfSeats = builder.numberOfSeats;
		this.engineType = builder.engineType;
		this.color = builder.color;
		this.gps = builder.gps;
		this.tripComputer = builder.tripComputer;
	}

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", engineType=" + engineType + ", color=" + color + ", gps="
				+ gps + ", tripComputer=" + tripComputer + "]";
	}
	
	
}
