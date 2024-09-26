package decorator_pattern.basic.concrete_component;

import decorator_pattern.basic.component.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		setDescription("House Blend Coffee");
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
