package com.wipro.objectsdemo;

public class GrabageDemo {

	public static void main(String[] args) {
		 //waste objects--->deallocate the memory assigned to objects
		 //Garbage collection--   object types>  
		//                       1. anonymous reference
		 //                      2. null reference
	     //                      3. assigning null reference to another reference
		
		         new GrabageDemo(); //  type 1
		         GrabageDemo obj1=null; // type 2
		         GrabageDemo obj2= obj1;   // type 3
		          System.gc();           
		    }
	   protected void finalize()
	    {
	    	System.out.println("garbage collection might be working!");
	    }
	
	
	
	
	

}
