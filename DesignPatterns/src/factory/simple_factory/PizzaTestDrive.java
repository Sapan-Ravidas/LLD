package factory.simple_factory;

import factory.simple_factory.client.PizzaStore;
import factory.simple_factory.factory.SimplePizzaFactory;
import factory.simple_factory.product.Pizza;

public class PizzaTestDrive {
	public static void main(String...strings) {
		SimplePizzaFactory factory = new SimplePizzaFactory(); // concrete object
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza1 = store.orderPizza("cheese");
		System.out.println(pizza1);
	}
}
