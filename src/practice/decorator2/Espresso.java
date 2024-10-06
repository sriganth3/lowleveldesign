package practice.decorator2;

public class Espresso implements Bevarage {

	@Override
	public String getIngredients() {
		return "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .95;
	}

}
