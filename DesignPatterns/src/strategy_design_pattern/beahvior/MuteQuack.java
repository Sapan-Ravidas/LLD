package strategy_design_pattern.beahvior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("silence");
	}
}
