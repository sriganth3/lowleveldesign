package designpatterns.behavioral.observer;

public enum WeatherType {

	SUNNY("Sunny"),
	RAINY("Rainy"),
	COLD("Cold");
	
	private final String description;

	WeatherType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
	
}
