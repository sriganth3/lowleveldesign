package designpatterns.behavioral.observer;

public class Orc implements Observer {

	@Override
	public void update(WeatherType currentWeather) {
		System.out.println("The Orcs are facing "+ currentWeather + " weather now");
		
	}
	
}
