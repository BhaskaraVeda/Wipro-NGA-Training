package com.wipro.methods;

public class Iphone  extends Mobile {
	// super means parent class and subclass means child class
// super keyword is used to access properties of parent inside the child class
	int model =14;
	
	public void displaylocal()
	{
		int model=20;
		System.out.println("local variable : "+model);  
	System.out.println("using this current clasvariable/instance variable"+this.model); 
		System.out.println("using super parent variabe"+super.model); 
	}
	
}
//
//iphone 3 extends iphone 2
//iphone 4 extends iphone3
//iphone 5  ---> iphone 4+ new features  extends iphone4
//
//class iphone 6 extends iphone 5
//
//class iphone 13 extends iphone 12
//class iphoen 14 extends iphone 13
