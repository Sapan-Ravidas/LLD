package factory.simple_factory.concrete_product;

import factory.simple_factory.product.Pizza;

public class ClamPizza extends Pizza {
	
	public ClamPizza() {
		setName("ClamPizza");
		setDough("Thin Crust");
		setSauce("White Garlic Sauce");
		addTopping("clams");
		addTopping("grated parmesan cheese");
	}
}
