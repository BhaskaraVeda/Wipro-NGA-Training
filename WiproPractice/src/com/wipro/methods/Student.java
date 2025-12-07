package com.wipro.methods;

public class Student {
	
	String name,rollno;// global 
	
void readDetails(String name,String rollno)//local
{
	this.name=name;
	this.rollno=rollno;  // super,this
}

void displayDetails()
{
	System.out.println(name);
	System.out.println(rollno);
}
  protected void result()
{
	
}


}
