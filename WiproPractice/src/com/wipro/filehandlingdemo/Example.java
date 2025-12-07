package com.wipro.filehandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Example {

	public static void main(String[] args) {
		try
		{
	Student s1=new Student(12,"sakshi");	//one object	
	//Create a stream and add object
	FileOutputStream fout=new FileOutputStream("demo.text");
	ObjectOutputStream out=new ObjectOutputStream(fout);		
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Object is serialized");	
		}
		catch(Exception e)
		{System.out.println(e);
			
		}
		
		System.out.println("deserialization");
		// deserialization
		try
		{
			FileInputStream fin=new FileInputStream("demo.text");
		ObjectInputStream oin=new ObjectInputStream(fin);
	
		     Student obj= (Student)oin.readObject();
		System.out.println(obj);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		
	}

}
