package designpatterns.structural.flyweight;

public class PoisonPotion implements Potion{

	@Override
	public void drink() {
		System.out.println("You are sick. (Potion=" + System.identityHashCode(this)+")");
	}

}
