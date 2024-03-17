package designpatterns;

import java.util.ArrayList;
import java.util.List;

import designpatterns.common.Utils;
import designpatterns.structural.adapter.CollegeStudent;
import designpatterns.structural.adapter.SchoolStudent;
import designpatterns.structural.adapter.SchoolStudentAdapter;
import designpatterns.structural.adapter.Student;
import designpatterns.structural.bridge.Restaurant;

import designpatterns.structural.bridge.AmericanRestaurant;
import designpatterns.structural.bridge.ItalianRestaurant;
import designpatterns.structural.bridge.PepperoniPizza;
import designpatterns.structural.bridge.VeggiePizza;
import designpatterns.structural.composite.product.Book;
import designpatterns.structural.composite.CompositeBox;
import designpatterns.structural.composite.DeliveryService;
import designpatterns.structural.composite.product.VideoGame;
import designpatterns.structural.facade.DwarvenGoldMineFacade;
import designpatterns.structural.flyweight.AlchemistShop;
import designpatterns.structural.proxy.IvoryWizardTower;
import designpatterns.structural.proxy.Wizard;
import designpatterns.structural.proxy.WizardTowerProxy;

public class StructuralPatternTest {

	public static void main(String[] args) {
		
		// Adapter Design Pattern
		Utils.header("Adapter Design Pattern");
		callAdapter();
		
		// Bridge Design Pattern
		Utils.header("Bridge Design Pattern");
		callBridge();
		
		// Composite Design Pattern
		Utils.header("Composite Design Pattern");
		callComposite();
		
		// Facade Design Pattern
		Utils.header("Facade Design Pattern");
		callFacade();
		
		// Flyweight Design Pattern
		Utils.header("Flyweight Design Pattern");
		callFlyWeight();
		
		// Proxy Design Pattern
		Utils.header("Proxy Design Pattern");		
		callProxy();
	}

	/*
	 * Adapter Design Pattern
	 * 
	 */
	private static void callAdapter() {
		List<Student> studentList = new ArrayList<>();
		
		SchoolStudent schoolStudent = new SchoolStudent("John","Doe");
		
		CollegeStudent collegeStudent = new CollegeStudent("John","Doe");
		
		studentList.add(collegeStudent);
		
		studentList.add(new SchoolStudentAdapter(schoolStudent));
		
		System.out.println(studentList);
	}
	

	/*
	 * Bridge Design Pattern
	 * 
	 */
	private static void callBridge() {

		Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();


        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
	}
	
	/*
	 * Composite Design Pattern
	 * 
	 */
	private static void callComposite() {
		
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.setupOrder(
				new Book("Alchemist", 300),
				new CompositeBox(
				new CompositeBox(new VideoGame("GTA", 200.00)), 
				new Book("Emotional Intelligence", 900.00)
				));
		
		System.out.println("Total Price: " + deliveryService.calculateOrderPrice());
	}
	
	/*
	 * Facade Design Pattern
	 * 
	 */
	private static void callFacade() {
		
		DwarvenGoldMineFacade facade = new DwarvenGoldMineFacade();
		facade.startNewDay();
		facade.workOnMine();
		facade.endOfTheDay();
	}
	
	/*
	 * Flyweight Design Pattern 
	 * 
	 */
	private static void callFlyWeight() {
		AlchemistShop shop = new AlchemistShop();
		shop.drinkPotions();
	}
	
	/*
	 * Proxy Design Pattern
	 * 
	 */
	
	private static void callProxy() {
		WizardTowerProxy proxy = new WizardTowerProxy(new IvoryWizardTower());
		
		proxy.enter(new Wizard("Harry Potter"));
		proxy.enter(new Wizard("Albus Dumbledore"));
		proxy.enter(new Wizard("Severus Snape"));
		proxy.enter(new Wizard("Ron Weasley"));
	}
}
