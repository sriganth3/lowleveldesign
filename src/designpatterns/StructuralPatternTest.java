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
}
