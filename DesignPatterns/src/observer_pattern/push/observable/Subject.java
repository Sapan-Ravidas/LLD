package observer_pattern.push.observable;

import observer_pattern.push.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void notifyObservers();
	void removeObserver(Observer observer);
}
