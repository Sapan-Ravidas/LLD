package strategy_design_pattern2.roles;

import strategy_design_pattern2.fighting_style.WeaponBehavior;

public abstract class Characters {
	
	WeaponBehavior weapon;
	
	public Characters() {}
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public abstract void display();
}
