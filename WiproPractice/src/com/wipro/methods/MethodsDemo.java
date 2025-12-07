package com.wipro.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		int x = md.sum(2, 3); // print 5
		int y = md.sum(7, 2); // print 9
		   System.out.println(md.sum(x, y)); // 5,9
	}

	int sum(int x, int y) {
		// anycode ou can put here
		return x+y;
	}
	
	String getName()
	{
		return "Sakshi";
	}

	char getMyChangedChar()
	{
		char ch='s';
		return ch;
	}
	
	//    simpleInterest(24000,9,2);
	//    checkEndString("sakshi","hi"); //   matched! or unmatched!
	//    areaOfCircle(23.5f);
	
	
	
	
	
	
	
}

//methods/ functions

// return type and non-return type