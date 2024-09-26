package decorator_pattern.basic;

import decorator_pattern.basic.concrete_component.*;
import decorator_pattern.basic.component.*;
import decorator_pattern.basic.component.Beverage.Size;
import decorator_pattern.basic.decorator.*;
import decorator_pattern.basic.concrete_decorator.*;

public class CoffeeShop {
	public static void main(String...strings) {
		Beverage beverage1 = new HouseBlend();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		Beverage beverage2 = new Mocha(beverage1);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new Whip(new Mocha(new Mocha(new DarkRoast())));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		Beverage beverage4 = new HouseBlend();
		beverage4.setSize(Size.MEDIUM);
		beverage4 = new Whip(new Mocha(new Soy(beverage4)));
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
	}
}
