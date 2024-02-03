package designpatterns.abstractfactory;

public class ConcreteLaptopFactory implements GadgetFactory {

	@Override
	public Gadget createGadget(String model) {
		
		return new Laptop(model);
	}

}
