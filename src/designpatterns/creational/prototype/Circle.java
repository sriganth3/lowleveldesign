package designpatterns.creational.prototype;


public class Circle extends Shape {

	public int radius;
	
	public Circle(Circle source) {
		super(source);
		if(source != null) {
			this.radius = source.radius;
		}
		
	}

	public Circle() {
		
	}

	@Override
	public Shape clone() {
		
		return new Circle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}
	
	

}
