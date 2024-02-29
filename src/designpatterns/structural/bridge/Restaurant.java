package designpatterns.structural.bridge;

public abstract class Restaurant {

	
	protected Pizza pizza;
	
    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public void deliver() {
    	System.out.println("-------Order Received-------");
    	addCrust();
    	addSauce();
    	addToppings();
    	pizza.assemble();
    	System.out.println("Order is Ready!");
    	
    }
    
    public abstract void addCrust();
    public abstract void addSauce();
    public abstract void addToppings();
    
}
