I have implemented Proxy pattern in this example of Coffee Makers for different types of coffee.

#Why
Suppose I have a coffee shop and there are multiple coffee makers for different types of coffee, for example, capuccino, french vanilla and mocha. I want to make all types of coffee available in my shop, but I don't want to waste and I want to minimize loss.

Now, before someone wants a particular coffee, I don't want to load the Coffee Maker with that type of coffee. 
Because its expensive and if someone is not asking for it then it will be wasted.

Thats why I have used Proxy pattern so that I have all types of coffee available in the menu but I make them on demand only and when I make a coffee on demand, I make 3 cups of it. Once these 3 cups of coffee gets finished, if I get another order, I make 3 cups more of that type of coffee.

#Implementation
Here RealCoffeeMaker and ProxyCoffeeMaker implements CoffeeMaker interface.
When a specific type of coffee pouring request comes, ProxyCoffeeMaker checks if there is no RealCoffeeMaker object for that type of coffee or if that type of coffee is empty, then it creates a new RealCoffeeMaker object and call pour method, otherwise just call the pour method of already existing RealCoffeeMaker object.

If it gets empty (initially 3 cups for each type of coffee when gets created on demand), then creates a new object of RealCoffeeMaker again.

ProxyPatternTestClient has the main method to test this pattern implementation.