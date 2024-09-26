package strategy_design_pattern2.fighting_style;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void fight() {
		System.out.println("I figt with sword");
	}
	
}
