package strategy_design_pattern.concrete;

import strategy_design_pattern.Duck;
import strategy_design_pattern.beahvior.FlyNoWay;
import strategy_design_pattern.beahvior.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}
