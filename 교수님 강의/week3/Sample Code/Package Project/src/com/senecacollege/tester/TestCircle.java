package com.senecacollege.tester;
import java.util.Scanner;
import com.senecacollege.mali.*;
import com.senecacollege.methods.*;

public class TestCircle {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Circle c_obj1 = new Circle();
		Circle c_obj2 = new Circle(5.0);
		
		CircleMethods cm_obj1 = new CircleMethods();
				
		System.out.println("Enter the radius of the circle: ");
		double entered_radius = input.nextDouble();
		
		c_obj1.setRadius(entered_radius);
		
		System.out.println("The radius set using the setter method: "+ c_obj1.getRadius());
		System.out.println("The radius set using the overloaded constructor: "+ c_obj2.getRadius());
		
		System.out.println("Area of the circle using First Circle object: " + cm_obj1.getArea(c_obj1.getRadius()));
		System.out.println("Area of the circle using Second Circle object: " + cm_obj1.getArea(c_obj2.getRadius()));
		
		
	}
}
