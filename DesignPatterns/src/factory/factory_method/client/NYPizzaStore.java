package factory.factory_method.client;

import factory.factory_method.product.Pizza;
import factory.factory_method.concrete_product.*;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new NYClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYPepperoniPizza();
		}
		return pizza;
	}

}
