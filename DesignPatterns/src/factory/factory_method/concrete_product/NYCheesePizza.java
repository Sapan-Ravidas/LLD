package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class NYCheesePizza extends Pizza{
	public NYCheesePizza() {
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		addTopping("Grated Reggiano Cheese");
	}

}
