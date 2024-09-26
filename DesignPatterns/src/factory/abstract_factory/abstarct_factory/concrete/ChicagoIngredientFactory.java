package factory.abstract_factory.abstarct_factory.concrete;

import factory.abstract_factory.abstarct_factory.PizzaIngredientsFactory;
import factory.abstract_factory.ingredients.Cheese;
import factory.abstract_factory.ingredients.Clams;
import factory.abstract_factory.ingredients.Dough;
import factory.abstract_factory.ingredients.Sauce;
import factory.abstract_factory.ingredients.Veggies;
import factory.abstract_factory.ingredients.concrete.*;

public class ChicagoIngredientFactory implements PizzaIngredientsFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVegies() {
		return null;
	}

	@Override
	public Clams createClams() {
		return null;
	}

}
