package practice.decorator2;

public class MilkDecorator extends FlavourDecorator {
	
	public MilkDecorator(Bevarage beverage) {
		super(beverage);
	}


	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return this.beverage.getIngredients() + ", Milk";
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + .10;
	}

}
