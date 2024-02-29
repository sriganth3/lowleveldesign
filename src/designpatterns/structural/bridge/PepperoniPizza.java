package designpatterns.structural.bridge;

public class PepperoniPizza extends Pizza{

	@Override
	public void assemble() {
		System.out.println("Adding sauce: "+ this.getSauce());
		System.out.println("Adding toppings: "+ this.getToppings());
		System.out.println("Adding pepperoni!");
	}
	

}
