package factory.simple_factory.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}

	private String name;
	private String dough;
	private String sauce;
	private List<String> toppings;
	
	public Pizza() {
		toppings = new ArrayList<>();
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void addTopping(String topping) {
		toppings.add(topping);
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prepare() {
		System.out.println("preparing " + name);
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
