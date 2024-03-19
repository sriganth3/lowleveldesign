package designpatterns.behavioral.chainofresponsibility;

public class Request {
	
	private final RequestType requestType;
	
	private final String requestDescription;
	
	private boolean handled;
	
	public Request(final RequestType requestType, final String requestDescription) {
		this.requestType = requestType;
		this.requestDescription = requestDescription;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public String getRequestDescription() {
		return requestDescription;
	}


	public boolean isHandled() {
		return handled;
	}

	public void markHandled() {
		this.handled = true;
	}

	@Override
	public String toString() {
		return getRequestDescription();
	}
	
}
