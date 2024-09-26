package observer_pattern.pull.display;

import observer_pattern.pull.observable.Subject;
import observer_pattern.pull.observable.WeatherData;
import observer_pattern.pull.observer.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject observable; // when observer want to unsubscribe from subject
	
	public CurrentConditionDisplay(Subject observable) {
		this.observable = observable;
		observable.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("current temp=" + temp + ", humidity=" + humidity);
	}

	@Override
	public void update(Subject obs) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
