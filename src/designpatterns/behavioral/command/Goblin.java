package designpatterns.behavioral.command;

public class Goblin extends Target {

	public Goblin() {
		setSize(Size.NORMAL);
		setVisibility(Visibility.VISIBLE);
	}
	
	@Override
	public void changeSize() {
		Size prevSize = this.getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
		setSize(prevSize);
		
	}

	@Override
	public void changeVisibility() {
		Visibility prevVisibility = this.getVisibility() == Visibility.VISIBLE ? Visibility.INVISIBLE : Visibility.VISIBLE;
		setVisibility(prevVisibility);
	}

	@Override
	public String toString() {
		return "Goblin";
	}

}
