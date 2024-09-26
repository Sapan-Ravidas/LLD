package factory.abstract_factory.concrete_product;

import factory.abstract_factory.product.Pizza;
import factory.abstract_factory.abstarct_factory.PizzaIngredientsFactory;

public class CheesePizza extends Pizza{
	
	PizzaIngredientsFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientsFactory factory) {
		this.ingredientFactory = factory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}
	
}
