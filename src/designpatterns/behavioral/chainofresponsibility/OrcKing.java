package designpatterns.behavioral.chainofresponsibility;

import java.util.Comparator;
import java.util.List;

public class OrcKing {

	private List<RequestHandler> handlers;
	
	public OrcKing() {
		handlers = List.of(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
	}
	
	public void makeRequest(Request req) {
	    handlers
	        .stream()
	        .sorted(Comparator.comparing(RequestHandler::getPriority))
	        .filter(handler -> handler.canHandle(req))
	        .findFirst()
	        .ifPresent(handler -> handler.handle(req));
	  }
	
}
