package loyola.oop.proxy.pattern;

import loyola.oop.proxy.pattern.interfaces.CoffeeMaker;

public class RealCoffeeMaker implements CoffeeMaker {
	
	private String coffeeName;
	private int cupsOfCoffeeLeft = 3;
	
	public RealCoffeeMaker(String coffeeName) {
		this.coffeeName = coffeeName;
		initializeCoffeeMachine();
	}
	
	private void initializeCoffeeMachine() {
		System.out.println("A new Coffee Maker initialized with " + cupsOfCoffeeLeft + " cups of" + coffeeName + " and ready to be served!");
	}

	@Override
	public void pourCoffee() {
		if (cupsOfCoffeeLeft > 0) {
			cupsOfCoffeeLeft--;
			System.out.println("Pouring " + coffeeName + " .... Now " + cupsOfCoffeeLeft +" cups of " + coffeeName + " left\n ");
		}
	}
	
	public boolean isEmpty() {
		if (cupsOfCoffeeLeft <= 0) {
			return true;
		}
		return false;
	}

}
