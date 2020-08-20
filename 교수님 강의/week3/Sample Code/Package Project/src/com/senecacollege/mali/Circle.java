package com.senecacollege.mali;

public class Circle {
	private double radius;
	
	public Circle(){
		this.radius = 1.0;
	}
	
	public Circle(double user_radius){
		this.radius = user_radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double entered_radius) {
		this.radius = entered_radius;
	}
}
