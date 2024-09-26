package strategy_design_pattern;

import strategy_design_pattern.beahvior.FlyWithWings;
import strategy_design_pattern.beahvior.Quack;
import strategy_design_pattern.concrete.MallardDuck;
import strategy_design_pattern.concrete.ModelDuck;

public class DuckSimulator {
	public static void main(String...strings) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehvaior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.swim();
		mallardDuck.performFly();
		
		System.out.println();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.swim();
		modelDuck.performFly();
	}
}
