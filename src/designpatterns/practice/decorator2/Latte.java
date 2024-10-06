package designpatterns.practice.decorator2;

public class Latte implements Bevarage {

	@Override
	public String getIngredients() {
		return "Latte";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
