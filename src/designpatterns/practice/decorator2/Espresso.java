package designpatterns.practice.decorator2;

public class Espresso implements Bevarage {

	@Override
	public String getIngredients() {
		return "Espresso";
	}

	@Override
	public double cost() {
		
		return .95;
	}

}
