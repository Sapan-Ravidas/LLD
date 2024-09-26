package factory.abstract_factory.concrete_product;

import factory.abstract_factory.abstarct_factory.PizzaIngredientsFactory;
import factory.abstract_factory.product.Pizza;

public class ClamsPizza extends Pizza{

	PizzaIngredientsFactory factory;
	
	public ClamsPizza(PizzaIngredientsFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(factory.createDough());
		setSauce(factory.createSauce());
		setClams(factory.createClams());
	}

}
