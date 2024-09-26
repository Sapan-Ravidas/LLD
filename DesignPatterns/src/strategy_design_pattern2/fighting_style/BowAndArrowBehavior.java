package strategy_design_pattern2.fighting_style;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void fight() {
		System.out.println("I fight with bow and arrow");
	}

}
