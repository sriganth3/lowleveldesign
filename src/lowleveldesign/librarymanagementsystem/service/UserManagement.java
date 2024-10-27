package lowleveldesign.librarymanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import lowleveldesign.librarymanagementsystem.model.User;

public class UserManagement {

	private List<User> users;

	public UserManagement() {
		super();
		this.users = new ArrayList<>();
	}


	public boolean addUser(User user) {
		if(user == null || user.getId() == null || user.getName() == null) {
			return false;
		}
		
		this.users.add(user);
		System.out.println("User Added");
		return true;
	}

	public boolean removeUser(String id) {
		if(id == null) {
			return false;
		}
		for(User user: users) {
			if(user.getId().equals(id)) {
				users.remove(user);
				System.out.println("User Removed");
				return true;
			}
		}
		return false;
	}



}
