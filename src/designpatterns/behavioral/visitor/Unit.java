package designpatterns.behavioral.visitor;

import java.util.Arrays;

public abstract class Unit {

	private Unit[] children;
	
	public Unit(Unit...children) {
		this.children = children;
	}
	
	public void accept(UnitVisitor visitor) {
		Arrays.stream(children).forEach(child -> child.accept(visitor));
	}
}
