package factory.simple_factory.factory;

import factory.simple_factory.product.Pizza;
import factory.simple_factory.concrete_product.*;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}
		
		return pizza;
	}
}
