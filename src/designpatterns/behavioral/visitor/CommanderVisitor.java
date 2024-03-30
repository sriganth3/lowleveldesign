package designpatterns.behavioral.visitor;

public class CommanderVisitor implements UnitVisitor {

	@Override
	public void visit(Commander commander) {
		System.out.println("Good to see you "+ commander);
		
	}

	@Override
	public void visit(Sergeant sergeant) {
				
	}

	@Override
	public void visit(Solider solider) {
		
	}

}
