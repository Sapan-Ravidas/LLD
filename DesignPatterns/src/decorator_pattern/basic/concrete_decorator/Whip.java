package decorator_pattern.basic.concrete_decorator;

import decorator_pattern.basic.component.Beverage;
import decorator_pattern.basic.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		setBeverage(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return getBeverage().cost() + 0.10;
	}

}
