package designpatterns.abstractfactory;

public class Mobile extends Gadget{

	private String model;
	
	public Mobile(String model) {
		super("Mobile");
		this.model = model;
	}

	@Override
	public String getModel() {
		
		return model;
	}

}
