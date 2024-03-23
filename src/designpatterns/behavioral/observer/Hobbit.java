package designpatterns.behavioral.observer;

public class Hobbit implements Observer {

	@Override
	public void update(WeatherType currentWeather) {
		System.out.println("The Hobbits are facing "+ currentWeather + " weather now");
		
	}
	
}
