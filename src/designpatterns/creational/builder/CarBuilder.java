package designpatterns.creational.builder;

public interface CarBuilder {

	public CarBuilder setSeats(int numberOfSeats);
	
	public CarBuilder setEngine(String engineType);
	
	public CarBuilder setChassis(String color);
	
	public CarBuilder setGPS();

	public CarBuilder setTripComputer(String type);

	public Car build();
	
}