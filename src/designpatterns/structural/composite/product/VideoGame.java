package designpatterns.structural.composite.product;

public class VideoGame extends Product {
	
	public VideoGame(String title, double price) {
		super(title, price);
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}
	
	
}
