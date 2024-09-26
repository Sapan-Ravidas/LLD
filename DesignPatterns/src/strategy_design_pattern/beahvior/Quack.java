package strategy_design_pattern.beahvior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack quack");
	}

}
