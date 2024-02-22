package designpatterns.creational.singleton;

public class Singleton {

	private static volatile Singleton instance;
	
	public static long value;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					System.out.print("Singleton instance is created");
					instance = new Singleton();
					value = System.currentTimeMillis();

				}else {
					System.out.print("returning Existing Singleton instance");
				}
			}
		}else {
			System.out.print("returning Existing Singleton instance");
		}
		return instance;
	}
}
