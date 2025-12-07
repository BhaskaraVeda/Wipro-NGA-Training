package com.wipro.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
	
		try {
			int a=s.nextInt();
			a=a/0;
		}
	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("important code!");
		}
		System.out.println("application is still running");
		
		
	}}
		
		
//		for (int i = 1; i <= 10; i++) {
//			if(i==5)
//			{
//		          i= i/0;
//			}
//			System.out.println(i);
//		}
	
/*
 * syntax error ----> compile time error errors coming after running the code
 * -----> Runtime error // (Exceptions)
 * Exceptions disrupts the normal flow of your execution
 * 
 * 
 *     try
 *     {
 *     
 *       // risk code-- which might cause exceptions
 *     }
 *     catch(ExceptionName   object)
 *     {
 *     // take actions when exception is caught
 *     // print the msg or resolve the issue of exception
 *     }
 *     
 * 
 * 
 *    try{
 *    
 *    }
 *    catch(ExceptionName variablename)
 *    {
 *    
 *    }
 * 
 * custom exceptions
 * throw and throws
 * 
 * 
 * 
 * 
 */