package designpatterns.practice.decorator2;

public class MilkDecorator extends FlavourDecorator {
	
	public MilkDecorator(Bevarage beverage) {
		super(beverage);
	}


	@Override
	public String getIngredients() {
		
		return this.beverage.getIngredients() + ", Milk";
	}


	@Override
	public double cost() {
		
		return this.beverage.cost() + .10;
	}

}
