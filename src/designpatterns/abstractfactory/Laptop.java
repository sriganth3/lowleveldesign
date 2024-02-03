package designpatterns.abstractfactory;

public class Laptop extends Gadget{

	private String model;
	
	public Laptop(String model) {
		super("Laptop");
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getModel() {
		
		return model;
	}

}
