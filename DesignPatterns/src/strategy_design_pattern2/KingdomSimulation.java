package strategy_design_pattern2;

import strategy_design_pattern2.fighting_style.SwordBehavior;
import strategy_design_pattern2.roles.Characters;
import strategy_design_pattern2.roles.King;

public class KingdomSimulation {
	public static void main(String...strings) {
		Characters king = new King();
		king.setWeapon(new SwordBehavior());
		king.display();
	}
}
