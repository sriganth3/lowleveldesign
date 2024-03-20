package designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

	private List<User> users;
	
	public ChatRoom() {
		users = new ArrayList<>();
	}
	
	public void sendMessage(User user, String message) {
		for(User member : users) {
			if(!member.equals(user)) {
				member.recieve(message);
			}
		}
	}

	@Override
	public void addMember(User user) {
		System.out.println(user + " added to the chatroom");
		users.add(user);
	}
}
