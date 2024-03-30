package designpatterns.behavioral.visitor;

public class Commander extends Unit{
	
	public Commander(Unit... children) {
		super(children);
	}
	
	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}
	
	@Override
	public String toString() {
		return "Commander";
		
	}
}
