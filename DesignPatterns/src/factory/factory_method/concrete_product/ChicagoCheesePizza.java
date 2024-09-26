package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		setName("Chicago Deepe Dish Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		addTopping("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("cutting pizza into square slices");
	}
}
