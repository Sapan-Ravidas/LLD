package factory.abstract_factory.product;

import java.util.Arrays;

import factory.abstract_factory.ingredients.*;

public abstract class Pizza {
	private String name;
	
	// ingredients
	Dough dough;
	Sauce sauce;
	Clams clams;
	Cheese cheese;
	Veggies veggies[];
	
	public abstract void prepare();
	

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clam) {
		this.clams = clam;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", clams=" + clams + ", cheese="
				+ cheese + ", veggies=" + Arrays.toString(veggies) + "]";
	}


	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bake() {
		System.out.println("baking " + name);
	}

	public void cut() {
		System.out.println("cutting " + name);
	}

	public void box() {
		System.out.println("packing " + name);
	}
}
