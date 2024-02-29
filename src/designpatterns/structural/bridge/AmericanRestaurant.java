package designpatterns.structural.bridge;

public class AmericanRestaurant  extends Restaurant{

	public AmericanRestaurant(Pizza pizza) {
		super(pizza);
		
	}

	@Override
	public void addCrust() {
		
		pizza.setToppings("Thin");
		
	}

	@Override
	public void addSauce() {
		
		pizza.setSauce("Secret");
	}

	@Override
	public void addToppings() {
		
		pizza.setToppings("Everything");
	}

}
