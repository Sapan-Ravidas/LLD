package observer_pattern.push.observable;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.push.observer.Observer;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
