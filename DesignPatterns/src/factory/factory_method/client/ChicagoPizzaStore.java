package factory.factory_method.client;

import factory.factory_method.product.Pizza;
import factory.factory_method.concrete_product.*;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoPepperoniPizza();
		} 
		return pizza;
	}

}
