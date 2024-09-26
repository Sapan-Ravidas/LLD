package factory.abstract_factory.concrete_product;

import factory.abstract_factory.abstarct_factory.PizzaIngredientsFactory;
import factory.abstract_factory.product.Pizza;

public class VegPizza extends Pizza {
	
	PizzaIngredientsFactory factory;
	
	public VegPizza(PizzaIngredientsFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(factory.createDough());
		setSauce(factory.createSauce());
		setVeggies(factory.createVegies());
	}

}
