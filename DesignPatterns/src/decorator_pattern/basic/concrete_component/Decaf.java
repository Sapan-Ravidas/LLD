package decorator_pattern.basic.concrete_component;

import decorator_pattern.basic.component.Beverage;

public class Decaf extends Beverage {
	
	public Decaf() {
		setDescription("Decaf");
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
