package factory.abstract_factory.abstarct_factory;

import factory.abstract_factory.ingredients.*;

public interface PizzaIngredientsFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVegies();
	public Clams createClams();
}
