package designpatterns.behavioral.visitor;

public class Sergeant extends Unit{
	
	public Sergeant(Unit... children) {
		super(children);
	}
	
	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}
	
	@Override
	public String toString() {
		return "Sergeant";
		
	}
}
