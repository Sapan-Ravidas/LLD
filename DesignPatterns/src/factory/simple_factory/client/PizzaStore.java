package factory.simple_factory.client;

import factory.simple_factory.factory.SimplePizzaFactory;
import factory.simple_factory.product.Pizza;

/**
 * This is the "client" if the factory. PizzaStore goes through the 
 * SimplePizzafactory to get instance of Pizza
 */
public class PizzaStore {
	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
