package practice.builder1;

public interface MealBuilder {

	public MealBuilder addAddOns(String addOns);
	public MealBuilder addDrinks(String drinks);
	public MealBuilder addSideDish(String sideDish);
	public MealBuilder addDessert(String dessert);
	public Meal build();
}
