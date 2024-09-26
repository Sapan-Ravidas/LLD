package decorator_pattern.basic.concrete_component;

import decorator_pattern.basic.component.Beverage;

public class Espresso extends Beverage {
	
	public Espresso() {
		setDescription("Espresso");
	}

	@Override
	public double cost() {
		return 1.99;
	}
	
}
