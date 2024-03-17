package designpatterns.behavioral;

public class OrcCommander implements RequestHandler{

	
	@Override
	public boolean canHandle(Request req) {
		
		return req.getRequestType() == RequestType.DEFEND_CASTLE;
	}

	@Override
	public void handle(Request req) {
		req.markHandled();
		System.out.println(getName() + " handling request - " + req);
	}

	@Override
	public String getName() {
		
		return "Orc Commander";
	}

	@Override
	public int getPriority() {
		
		return 3;
	}

}
