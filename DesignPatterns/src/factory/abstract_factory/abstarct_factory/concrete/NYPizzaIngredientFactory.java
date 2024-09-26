package factory.abstract_factory.abstarct_factory.concrete;

import factory.abstract_factory.abstarct_factory.PizzaIngredientsFactory;
import factory.abstract_factory.ingredients.Cheese;
import factory.abstract_factory.ingredients.Clams;
import factory.abstract_factory.ingredients.Dough;
import factory.abstract_factory.ingredients.Sauce;
import factory.abstract_factory.ingredients.Veggies;
import factory.abstract_factory.ingredients.concrete.*;

public class NYPizzaIngredientFactory implements PizzaIngredientsFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVegies() {
		Veggies[] veggies = {new EggPlant(), new Onion(), new Garlic() };
		return veggies;
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
