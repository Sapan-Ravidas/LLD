package strategy_design_pattern.beahvior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak");
	}
	
}
