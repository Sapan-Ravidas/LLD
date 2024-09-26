package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class ChicagoClamPizza extends Pizza{
	public ChicagoClamPizza() {
		setName("Chicago Deepe Clam Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		addTopping("Shredded Mozzarella Cheese");
		addTopping("Frozen Clams from Chesapeake Bay");
	}
	
	public void cut() {
		System.out.println("cutting pizza into square slices");
	}
}
