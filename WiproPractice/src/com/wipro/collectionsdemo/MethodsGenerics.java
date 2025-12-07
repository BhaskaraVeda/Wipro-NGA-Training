package com.wipro.collectionsdemo;

import java.util.HashMap;

public class MethodsGenerics {
	
public static void main(String a[])
		{ 
	
	       Integer numbers[]= {2,3,56,7};
	           printArray(numbers);
	           
	       Float num2[]= {3.45f,34.88f, 83.3f};    
	       printArray(num2);
	       
	       Student  s1=new Student("Sakshi",12);
	       Student  s2=new Student("Rahul",21);
	       Student  s3=new Student("Yukti",13);
	       Student  s4=new Student("Pooja",15);
	       
	       Student stu[]= {s1,s2,s3,s4};
	       printArray(stu);
		}



 static <E> void  printArray(E[] elements)
{
	for(int i=0;i<elements.length;i++)
	{
		System.out.println(elements[i]);
	}
}
}

class Student
{
   String name;//pooja
   int rollno	;//21  ///  pooja       21
public Student(String name, int rollno) {
	super();
	this.name = name;
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
@Override  // annotation-- metadata
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + "]";
}
   
}


