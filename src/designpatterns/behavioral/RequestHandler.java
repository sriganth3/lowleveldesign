package designpatterns.behavioral;

public interface RequestHandler {

	public boolean canHandle(Request req);
	
	public void handle(Request req);
	
	public String getName();
	
	public int getPriority();
}
