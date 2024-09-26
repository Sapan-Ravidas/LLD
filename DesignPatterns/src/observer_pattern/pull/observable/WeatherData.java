package observer_pattern.pull.observable;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.pull.observer.Observer;

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
			observer.update(this);
		}
		
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
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
