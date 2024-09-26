package factory.factory_method;

import factory.factory_method.client.*;
import factory.factory_method.product.Pizza;

public class PizzaTestDrive {
	public static void main(String...strings) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println(pizza1);
		
		Pizza pizza2 = chicagoStore.orderPizza("clam");
		System.out.println(pizza2);
	}
}
