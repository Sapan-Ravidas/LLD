package strategy_design_pattern;

import strategy_design_pattern.beahvior.FlyBehavior;
import strategy_design_pattern.beahvior.QuackBehavior;

public abstract class Duck {
	
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public void setFlyBehvaior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All duck floats, even decoys");
	}
}
