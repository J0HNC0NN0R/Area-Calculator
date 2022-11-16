package com.campora.areacalculator;

public class AreaOfCircle {
	
	public static double area;
	public static double radius;
	public static double pi = 3.14;

	public static void main(String[] args) {

		calcAreaOfCircle(area, radius);
		displayArea();

	}
	
	public static void calcAreaOfCircle(double area2, double radius2) {
	radius = pi;	
	area = (radius * radius);
		
	} 
	
	public static void displayArea() {
		System.out.println("The Area of a Circle is");
		System.out.println(area);
		
	}

}