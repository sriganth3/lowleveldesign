package designpatterns.behavioral.command;

public abstract class Target {

	private Size size;

	private Visibility visibility;

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public abstract void changeSize();

	public abstract void changeVisibility();

	@Override
	public abstract String toString();

	public void printStatus() {
		System.out.println(this + " size: "+ size + " visibility: "+ visibility);
	}
}
