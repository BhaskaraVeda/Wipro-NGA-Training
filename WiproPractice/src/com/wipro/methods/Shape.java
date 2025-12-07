package com.wipro.methods;

 public class Shape {

	 Shape(int side)
	{
		System.out.println("Area of square :"+ (side*side));
	}
	
	Shape(float radius)
	{
		System.out.println("Area of circle :"+ (3.14f * radius * radius));
	}
	
	Shape(int length,int breadth)
	{
		System.out.println("Area of rectangle :"+ (length* breadth));
	}
	
	
	
	
}
