package designpatterns.behavioral.mediator;

public class ChatUser extends User{

	public ChatUser(String name, ChatMediator mediator) {
		super(name, mediator);
	}

	@Override
	public void send(String message) {
		System.out.println(name + " sending a message: " + message);
		mediator.sendMessage(this, message);
	}

	@Override
	public void recieve(String message) {
		System.out.println(name + " receiving a message: " + message);
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
