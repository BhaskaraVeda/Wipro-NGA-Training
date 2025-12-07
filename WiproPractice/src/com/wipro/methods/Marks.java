package com.wipro.methods;

public class Marks extends Student  {
int m1,m2,m3;

void readMarks(int m1,int m2,int m3)
{
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}

void displayMarks()
{
	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);
}

//     void result() //Cannot reduce the visibility of the overrden/inherited method from Parent
//{
//	
//}
}
