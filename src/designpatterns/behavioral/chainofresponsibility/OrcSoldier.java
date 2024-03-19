package designpatterns.behavioral.chainofresponsibility;

public class OrcSoldier implements RequestHandler{

	
	@Override
	public boolean canHandle(Request req) {
		
		return req.getRequestType() == RequestType.GAURD_PRISONERS;
	}

	@Override
	public void handle(Request req) {
		req.markHandled();
		System.out.println(getName() + " handling request - " + req);
	}

	@Override
	public String getName() {
		
		return "Orc Soldiers";
	}

	@Override
	public int getPriority() {
		return 1;
	}

}
