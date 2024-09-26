package factory.abstract_factory.client.concrete;

import factory.abstract_factory.client.PizzaStore;
import factory.abstract_factory.product.Pizza;

import factory.abstract_factory.abstarct_factory.*;
import factory.abstract_factory.abstarct_factory.concrete.*;
import factory.abstract_factory.concrete_product.*;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientsFactory factory = new ChicagoIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("Chicago style cheese pizza");
		} else if (type.equals("veggies")) {
			pizza = new VegPizza(factory);
			pizza.setName("Chicago style veg pizza");
		} else if (type.equals("clams")) {
			pizza = new ClamsPizza(factory);
			pizza.setName("Chicago style clams pizza");
		}
		return pizza;
	}

}
