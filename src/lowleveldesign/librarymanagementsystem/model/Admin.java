package lowleveldesign.librarymanagementsystem.model;

public class Admin extends User{

	@Override
	public UserType getUserType() {
		// TODO Auto-generated method stub
		return UserType.ADMIN;
	}	
}
