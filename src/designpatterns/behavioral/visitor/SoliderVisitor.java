package designpatterns.behavioral.visitor;

public class SoliderVisitor implements UnitVisitor {

	@Override
	public void visit(Commander commander) {
		
	}

	@Override
	public void visit(Sergeant sergeant) {
		
	}

	@Override
	public void visit(Solider solider) {
		System.out.println("Good to see you "+ solider);
	}

}
