package strategy_design_pattern.beahvior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
	
}
