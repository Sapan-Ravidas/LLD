package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class NYPepperoniPizza extends Pizza{
	public NYPepperoniPizza() {
		setName("NY Style Pepperoni Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		addTopping("Grated Reggiano Cheese");
		addTopping("sliced pepperoni");
		addTopping("garlic");
		addTopping("onion");
		addTopping("mashrooms");
		addTopping("red pepper");
	}

}
