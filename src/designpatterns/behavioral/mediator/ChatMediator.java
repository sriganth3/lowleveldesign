package designpatterns.behavioral.mediator;

public interface ChatMediator {

	public void sendMessage(User user, String message);
	
	public void addMember(User user);    
	
}
