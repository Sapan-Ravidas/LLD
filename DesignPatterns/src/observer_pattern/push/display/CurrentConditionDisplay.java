package observer_pattern.push.display;

import observer_pattern.push.observable.WeatherData;
import observer_pattern.push.observer.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private WeatherData weatherdata; // when observer want to unsubscribe from subject
	
	@Override
	public void display() {
		System.out.println("current temp=" + temp + ", humidity=" + humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
