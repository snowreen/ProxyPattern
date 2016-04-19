package loyola.oop.proxy.pattern.client;

import loyola.oop.proxy.pattern.ProxyCoffeeMaker;
import loyola.oop.proxy.pattern.interfaces.CoffeeMaker;

public class ProxyPatternTestClient {

	public static void main(String[] args) {
		
		CoffeeMaker coffeeMaker1 = new ProxyCoffeeMaker("Capuccino");
		CoffeeMaker coffeeMaker2 = new ProxyCoffeeMaker("Mocha");
		CoffeeMaker coffeeMaker3 = new ProxyCoffeeMaker("French Vanilla");
		
		
		coffeeMaker1.pourCoffee();
		coffeeMaker1.pourCoffee();
		
		coffeeMaker2.pourCoffee();
		coffeeMaker2.pourCoffee();
		
		coffeeMaker3.pourCoffee();
		coffeeMaker3.pourCoffee();
		
		coffeeMaker1.pourCoffee();
		coffeeMaker2.pourCoffee();
		coffeeMaker3.pourCoffee();
		
		coffeeMaker1.pourCoffee();
		coffeeMaker2.pourCoffee();
		coffeeMaker3.pourCoffee();

	}

}
