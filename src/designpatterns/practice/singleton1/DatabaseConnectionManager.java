package designpatterns.practice.singleton1;

public class DatabaseConnectionManager {

	private static volatile DatabaseConnectionManager instance;
	
	private DatabaseConnectionManager() {
		
	}

	public static DatabaseConnectionManager getInstance() {
		if(instance == null) {
			synchronized(DatabaseConnectionManager.class) {
				if(instance == null) {
					instance = new DatabaseConnectionManager(); 
				}
			}
		}
		return instance;
	}

	public void connect() {
		System.out.println("Successfully connected to the database.");
	}

	public void disconnect() {
		System.out.println("Successfully disconnected from the database.");
	}
}
