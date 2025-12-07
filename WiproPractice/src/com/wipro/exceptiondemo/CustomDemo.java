package com.wipro.exceptiondemo;

import java.util.Scanner;

public class CustomDemo {

	public static void main(String[] args)  {
		  
		
        try {  
        	validAge(); 
        }
        catch(AgeException e)
        {
        	System.out.println(e.getMessage());
        	
        }
        System.out.println("application is still running");
        
	}
	
	
	static void  validAge() throws AgeException
	{
		Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        
        if(age>100 || age<18)
        { 
    throw new AgeException("not valid");//manually throw custom exception
    
        }
        else {
     System.out.println("age is valid!");
        }}
       
	}


