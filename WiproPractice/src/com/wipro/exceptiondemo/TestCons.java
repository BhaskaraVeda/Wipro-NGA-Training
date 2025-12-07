package com.wipro.exceptiondemo;

import java.util.regex.Pattern;

public class TestCons {
	public static void main(String[] args) 
	{
		
		
		System.out.println(Pattern.matches("s*kshi" ,"sakshi"));
		
		
		
		
		
		
		
		
//      B obj=new B(4); // calls to B() const.
//      obj.display();  
	}	
}
class A
{
	int x;
	public A()
	{
		System.out.println("Parent A constructor");
	}
	public A(int x)
	{
		this.x=x;
	}
}
class B extends A
{   
    public B(int x)
{
	super(x);
}
	public B()
	{
		System.out.println("Child B constructor");
	}
	
	void display()
	{
		System.out.println("Child B display method()"+x);
	}
	
}








//Practice Session is going on!









