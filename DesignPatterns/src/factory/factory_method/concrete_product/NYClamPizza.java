package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class NYClamPizza extends Pizza{
	public NYClamPizza() {
		setName("NY Style Clam Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		addTopping("Grated Reggiano Cheese");
		addTopping("Fresh Clams from long Island Sound");
	}

}
