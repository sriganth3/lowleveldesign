package designpatterns.structural.bridge;

public abstract class Pizza {
	private String crust;
	private String sauce;
	private String toppings;
	
	public String getCrust() {
		return crust;
	}
	
	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public String getToppings() {
		return toppings;
	}
	
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	public abstract void assemble();
	
	
}
