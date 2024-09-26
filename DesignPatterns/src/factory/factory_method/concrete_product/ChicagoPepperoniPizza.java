package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class ChicagoPepperoniPizza extends Pizza{
	public ChicagoPepperoniPizza() {
		setName("Chicago Deepe Pepperoni Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		addTopping("Shredded Mozzarella Cheese");
		addTopping("Black Olives");
		addTopping("Spinach");
		addTopping("EggPlant");
		addTopping("Sliced Pepperoni");
	}
	
	public void cut() {
		System.out.println("cutting pizza into square slices");
	}
}
