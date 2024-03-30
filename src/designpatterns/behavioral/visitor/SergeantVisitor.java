package designpatterns.behavioral.visitor;

public class SergeantVisitor implements UnitVisitor {

	@Override
	public void visit(Commander commander) {
		
	}

	@Override
	public void visit(Sergeant sergeant) {
		System.out.println("Good to see you "+ sergeant);
		
	}

	@Override
	public void visit(Solider solider) {
		
	}

}
