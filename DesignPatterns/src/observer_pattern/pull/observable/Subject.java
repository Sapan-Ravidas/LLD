package observer_pattern.pull.observable;

import observer_pattern.pull.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void notifyObservers();
	void removeObserver(Observer observer);
}
