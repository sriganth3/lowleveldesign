package practice.decorator2;

public class CaramelDecorator extends FlavourDecorator {

	public CaramelDecorator(Bevarage beverage) {
		super(beverage);
	}


	@Override
	public String getIngredients() {
		return this.beverage.getIngredients() + ", Caramel";
	}


	@Override
	public double cost() {
		return this.beverage.cost() + .15;
	}

}
