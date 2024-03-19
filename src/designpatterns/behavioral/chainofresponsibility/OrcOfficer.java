package designpatterns.behavioral.chainofresponsibility;

public class OrcOfficer implements RequestHandler{

	
	@Override
	public boolean canHandle(Request req) {
		
		return req.getRequestType() == RequestType.COLLECT_TAX;
	}

	@Override
	public void handle(Request req) {
		req.markHandled();
		System.out.println(getName() + " handling request - " + req);
	}

	@Override
	public String getName() {
		
		return "Orc Officer";
	}

	@Override
	public int getPriority() {
		return 2;
	}

}
