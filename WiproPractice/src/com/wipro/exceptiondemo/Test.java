package com.wipro.exceptiondemo;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
	
		 try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			System.out.println("print any message");
		} // checked Exception -- handled by system or compiler
		
		 
		 Class.forName(null); // working database	
		 
	}

}


// throw (handled by user)   and throws (System)