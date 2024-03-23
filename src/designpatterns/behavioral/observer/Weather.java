package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {

	private List<Observer> subscribers;
	
	private WeatherType currentWeather = WeatherType.SUNNY;
	
	public Weather() {
		subscribers = new ArrayList<>();
	}
	
	public void timePasses() {
		 WeatherType[] weathers = WeatherType.values();
		 currentWeather = weathers[(currentWeather.ordinal() + 1) % weathers.length];
		 System.out.println("Weather changed to: "+ currentWeather);
		 notifySubscribers();
	}

	private void notifySubscribers() {
		for(Observer sub: subscribers) {
			sub.update(currentWeather);
		}
		
	}
	
	public void addSubscribers(Observer subscriber) {
		this.subscribers.add(subscriber);
	}
	
	public void removeSubscribers(Observer subscriber) {
		this.subscribers.remove(subscriber);
	}
	
}
