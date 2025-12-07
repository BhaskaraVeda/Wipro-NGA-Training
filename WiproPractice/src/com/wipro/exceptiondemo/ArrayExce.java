package com.wipro.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExce {
public static void main(String[] args)  {
	Scanner s=new Scanner(System.in);	
	System.out.println("enter the size");
	
	
               try {
            	   int size=s.nextInt();
            		int a[]=new int[size];// enter only numbers /// sakshi
         
        	   System.out.println("enter the array elements");
        	   for(int i=0;i<size;i++)
        	   {
        		   a[i]=s.nextInt();//
        	   }
           
               }catch(InputMismatchException E){
            	   System.out.println("please give only numbers as a input");
               }
}}
