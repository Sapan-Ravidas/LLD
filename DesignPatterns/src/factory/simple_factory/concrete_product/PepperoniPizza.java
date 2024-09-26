package factory.simple_factory.concrete_product;

import factory.simple_factory.product.Pizza;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		setName("Pepperoni Pizza");
		setDough("Crust");
		setSauce("Marinara Pizza Sauce");
		addTopping("sliced pepperoni");
		addTopping("sliced onion");
		addTopping("garted permesan cheese");
	}
}
