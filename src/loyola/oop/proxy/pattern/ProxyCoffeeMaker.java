package loyola.oop.proxy.pattern;

import loyola.oop.proxy.pattern.interfaces.CoffeeMaker;

public class ProxyCoffeeMaker implements CoffeeMaker {
	
	private String coffeeName;
	private RealCoffeeMaker realCoffeeMaker;
	
	public ProxyCoffeeMaker(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	@Override
	public void pourCoffee() {
		if (realCoffeeMaker == null || realCoffeeMaker.isEmpty()) {
			realCoffeeMaker = new RealCoffeeMaker(coffeeName);
		}
		realCoffeeMaker.pourCoffee();
	}

}
