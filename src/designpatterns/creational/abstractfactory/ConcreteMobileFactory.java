package designpatterns.creational.abstractfactory;

public class ConcreteMobileFactory implements GadgetFactory{
	
	@Override
	public Gadget createGadget(String model) {
		
		return new Mobile(model);
	}
}
