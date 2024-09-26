package factory.simple_factory.concrete_product;

import factory.simple_factory.product.Pizza;

public class CheesePizza extends Pizza{
	public CheesePizza() {
		setName("Cheese Pizza");
		setDough("Regular Crust");
		setSauce("Marinara Pizza Sauce");
		addTopping("fresh mozzarella");
		addTopping("parmesan");
	}
}
