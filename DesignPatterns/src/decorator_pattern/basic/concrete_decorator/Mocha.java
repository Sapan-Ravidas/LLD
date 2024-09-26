package decorator_pattern.basic.concrete_decorator;

import decorator_pattern.basic.component.Beverage;
import decorator_pattern.basic.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		setBeverage(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return getBeverage().cost() + 0.20;
	}

}
