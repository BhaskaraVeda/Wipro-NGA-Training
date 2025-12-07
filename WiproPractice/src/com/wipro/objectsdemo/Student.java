package com.wipro.objectsdemo;

import com.wipro.methods.Mobile;

public class Student  {   // parent Parent---- name
	 String name,rollno; // instance variable/global variable-- accessible anywhere within a class
   static String comName="Wipro"; // static variable/global variable
	 
	 Student(String name, String rollno)  // constructor 
	 {
		   this.name=name;    //this is torefer the instance variable
		   this.rollno=rollno;
	 }
	
	void displayDetails()
     {
		
    	 System.out.println("Name : "+name);
    	 System.out.println("Rollno : "+rollno);
    	 System.out.println("Company Name : "+comName);
     }

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
//	
//	
		


}
class T
{
	
}



/*
 * constructor -- is a special method in java
 * 
 * 1. it has same name as classname
 * 2. it doesnot have any return type not even void
 * 3. it is used to initialize the class variables (global variables)
 *    
 *    tyypes
 *    default constructor --- no arguments
 *    parameterized constructor -- arguments const.
 * // jvm creates one default constructor for you
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Employee---> eid, salary, DOJ;
 * getter and setter
 
 * main()
 * Employee e1= new Employee();
 * 
 * e1. set all values of Employee
 * display all the fields using getter
 * 
 * 
 * 
 */
