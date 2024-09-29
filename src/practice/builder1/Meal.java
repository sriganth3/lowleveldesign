package practice.builder1;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private String mainCourse; 
	private String sideDish;
	private String drink;
	private String dessert;
	private List<String> addOns = new ArrayList<>();
	
	protected String getMainCourse() {
		return mainCourse;
	}
	protected void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	protected String getSideDish() {
		return sideDish;
	}
	protected void setSideDish(String sideDish) {
		this.sideDish = sideDish;
	}
	protected String getDrink() {
		return drink;
	}
	protected void setDrink(String drink) {
		this.drink = drink;
	}
	protected String getDessert() {
		return dessert;
	}
	protected void setDessert(String dessert) {
		this.dessert = dessert;
	}
	protected List<String> getAddOns() {
		return addOns;
	}
	protected void setAddOns(List<String> addOns) {
		this.addOns = addOns;
	}
	@Override
	public String toString() {
		return "Meal [mainCourse=" + mainCourse + ", sideDish=" + sideDish + ", drink=" + drink + ", dessert=" + dessert
				+ ", addOns=" + addOns + "]";
	}
	
	
}
