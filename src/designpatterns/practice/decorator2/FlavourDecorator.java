package designpatterns.practice.decorator2;

public abstract class FlavourDecorator implements Bevarage {

	protected Bevarage beverage;

	public FlavourDecorator(Bevarage beverage) {
		this.beverage = beverage;
	}

	@Override
	public abstract String getIngredients();

}
