package designpatterns.behavioral.visitor;

public interface UnitVisitor {

	public void visit(Commander commander);
	
	public void visit(Sergeant sergeant);
	
	public void visit(Solider solider);
}
