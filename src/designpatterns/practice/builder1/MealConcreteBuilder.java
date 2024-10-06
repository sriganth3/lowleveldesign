package designpatterns.practice.builder1;

public class MealConcreteBuilder implements MealBuilder {

	private Meal meal;

	public MealConcreteBuilder(String mainCourse) {
		meal = new Meal();
		meal.setMainCourse(mainCourse);
	}

	@Override
	public MealConcreteBuilder addAddOns(String addOns) {
		meal.getAddOns().add(addOns);
		return this;
	}

	@Override
	public MealConcreteBuilder addDrinks(String drinks) {
		meal.setDrink(drinks);
		return this;
	}

	@Override
	public MealConcreteBuilder addSideDish(String sideDish) {
		meal.setSideDish(sideDish);
		return this;
	}

	@Override
	public MealConcreteBuilder addDessert(String dessert) {
		meal.setDessert(dessert);
		return this;
	}

	@Override
	public Meal build() {
		
		return meal;
	}



}
