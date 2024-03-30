package designpatterns.behavioral.visitor;

public class Solider extends Unit{
	
	public Solider(Unit... children) {
		super(children);
	}
	
	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}
	
	@Override
	public String toString() {
		return "Solider";
		
	}
}
