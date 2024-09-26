package factory.abstract_factory;

import factory.abstract_factory.client.*;
import factory.abstract_factory.client.concrete.*;
import factory.abstract_factory.product.*;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println(pizza1);

		Pizza pizza2 = chicagoStore.orderPizza("veggies");
		System.out.println(pizza2);
	}

}
