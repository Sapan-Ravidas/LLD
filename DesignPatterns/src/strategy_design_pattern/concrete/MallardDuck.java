package strategy_design_pattern.concrete;

import strategy_design_pattern.Duck;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm mallarad Duck");
	}

}
