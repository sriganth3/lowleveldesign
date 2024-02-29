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

public class StructuralPatternTest {

	public static void main(String[] args) {
		
		// Adapter Design Pattern
		Utils.header("Adapter Design Pattern");
		callAdapter();
		
		// Bridge Design Pattern
		Utils.header("Bridge Design Pattern");
		callBridge();
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
}
