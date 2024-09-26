package decorator_pattern.basic.concrete_component;

import decorator_pattern.basic.component.Beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		setDescription("Dark Roast");
	}

	@Override
	public double cost() {
		return 0.99;
	}
	
}
