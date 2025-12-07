package com.wipro.collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

Student s1= new Student("Sakshi", 12);
        
        HashSet<Student> list = new HashSet<Student>();//unique elements
		list.add(s1);
		list.add( new Student("Pooja", 21));
		list.add( new Student("Yukti", 21));

		  
				
		   for(Student obj: list)
		   {
			   
			   if(obj.getName().equals("Yukti"))
			   {
				   System.out.println(obj);
			   }
		   }
		
		
		
		
		
		
	}

}







/*
 * 
 * for each loop ---> collections
 * 
 *     for(Datatype var    : list  )
 *     for(String obj : list)
 *     for(int obj: list)
 *     for(Student obj:list)
 */






