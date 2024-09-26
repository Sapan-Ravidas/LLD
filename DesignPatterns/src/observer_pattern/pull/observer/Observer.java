package observer_pattern.pull.observer;

import observer_pattern.pull.observable.Subject;

public interface Observer {
	void update(Subject obs);
}
