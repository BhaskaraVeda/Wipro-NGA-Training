package com.wipro.filehandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerExample {

	public static void main(String[] args) {
		Person obj=new Person("sakshi","1234");
		//serialization
		 try {
		FileOutputStream filestream=new FileOutputStream("demo.text");
		ObjectOutputStream stream1=new ObjectOutputStream(filestream);
		  stream1.writeObject(obj);
		  stream1.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
		 //deserialization
		  try
		  {
			FileInputStream filestream=new FileInputStream("demo.text");  
			ObjectInputStream stream2=new ObjectInputStream(filestream); 
			 Person objj=(Person)  stream2.readObject();
			 System.out.println(objj);
			
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		 
		 
	}
	
	

}

class Person implements Serializable
{
	String name,phone;

	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
}
