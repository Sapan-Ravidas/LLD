package decorator_pattern.basic.concrete_decorator;

import decorator_pattern.basic.component.Beverage;
import decorator_pattern.basic.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		setBeverage(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = getBeverage().cost();
		
		if (getBeverage().getSize() == Size.SMALL) {
			return cost + 0.10; 
		} else if (getBeverage().getSize() == Size.MEDIUM) {
			return cost + 0.15;
		} else if (getBeverage().getSize() == Size.LARGE) {
			return cost + 0.20;
		}
		return cost;
	}

}
