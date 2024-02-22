package designpatterns.prototype;

import java.util.Objects;

public abstract class Shape {
	public int x;
	public int y;
	public String color;
	
	public Shape() {
		
	}
	
	public Shape(Shape source) {
		super();
		if(source != null) {
			this.x = source.x;
			this.y = source.y;
			this.color = source.color;
		}
	}
	
	public abstract Shape clone();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Objects.equals(color, other.color) && x == other.x && y == other.y;
	}

	
	
}
