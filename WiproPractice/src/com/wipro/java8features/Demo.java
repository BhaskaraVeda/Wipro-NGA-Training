package com.wipro.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Demo {

	public static void main(String[] args) {
        Student s1=new Student(452,"sakshi"); //  
        Student s2=new Student(123,"yukti");  
        Student s3=new Student(464,"shubham");  //  
        Student s4=new Student(200,"sahil");  
		
		List<Student> list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4); 
		                                      
	  long y= list.stream()
	    .filter(x -> x.name.length()>5)
	    .map(x -> x.marks)
	     .count();// list of only names which is String
		
System.out.println(y);
		
	}

	
}


class Student
{
	int marks ;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}

//practice session is going on!





















