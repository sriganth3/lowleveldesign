package designpatterns.structural.bridge;

public class ItalianRestaurant extends Restaurant{

	public ItalianRestaurant(Pizza pizza) {
		super(pizza);
		
	}

	@Override
	public void addCrust() {
		
		pizza.setToppings("Thick");
		
	}

	@Override
	public void addSauce() {
		
		pizza.setSauce("Oil");
	}

	@Override
	public void addToppings() {
		
		pizza.setToppings("None");
	}

}
