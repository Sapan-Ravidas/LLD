package observer_pattern.pull;

import observer_pattern.pull.display.CurrentConditionDisplay;
import observer_pattern.pull.observable.WeatherData;
import observer_pattern.pull.observable.Subject;

// Subject is notifying every observers that data has been updated;
public class WeatherStation {
	public static void main(String...strings) {
		WeatherData weatherData = new WeatherData(); // concrete object of weather data
		
		// we'll required this object if display1 want to subscribe/unsubscribe to the subject
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData); // concrete object to display element
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		
	}
}
