package com.wipro.collectionsdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

public class AddAllDemo {

	public static void main(String[] args) {
		 ArrayList<Integer> list1=new ArrayList<Integer>();
	        list1.add(20);  // 
	        list1.add( 30); // 
	        list1.add( 40); // 
	        list1.add( 50); //
			
	        
	        ArrayList<Integer> list2=new ArrayList<Integer>();
	        list2.add(10);  // 
	        list2.add(15); // 
	        list2.add( 70); // 
	        list2.add( 90); //
	        
	        
	        ArrayList<Integer> list3=new ArrayList<Integer>();
	        list3.add(10);  // 
	        list3.add(15); // 
	        list3.add( 70); // 
	        list3.add( 90); //
	        
	
	        
	        ArrayList<ArrayList<Integer>> alllists=new ArrayList<>();
	        alllists.add(list1);
	        alllists.add(list2);
	        alllists.add(list3);
	        System.out.println(alllists);
	        
	        
	     //
	 	/* Iterator<Integer> itr= list.Iterator();  
	        while(itr.hasNext()) // 4
		     {
		    	 System.out.println(itr.next());
//		     }      // for each loop */
//	   ListIterator<Integer> itr= list.listIterator();
//	   while(itr.hasNext()) // 4
//	     {
//	    	 System.out.println(itr.next());
//	     }
//	     while(itr.hasPrevious()) // 4
//	     {
//	    	 System.out.println(itr.previous());
//	     }
	}
	}


// Contact List ---> name,phone,pincode
class Contacts
{
	String name,phone;
	int pincode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Contacts(String name, String phone, int pincode) {
		super();
		this.name = name;
		this.phone = phone;
		this.pincode = pincode;
	}
	
}








