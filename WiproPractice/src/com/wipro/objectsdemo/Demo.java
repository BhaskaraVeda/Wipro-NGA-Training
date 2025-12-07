package com.wipro.objectsdemo;

import java.util.Scanner;

public class Demo {

	static int scoreMaximize(String s)
	   {
		
		//aabbbcccc    c  length 9 - 4 =  5
	
		//26   a to z 
	       int n=s.length();
	       int temp[]=new int[26];// to store all alphabets
	       for(int i=0;i<26;i++){
	           temp[i]=0;   // initializing all elements to 0
	       }
	         
	       
	       for(int i=0;i<s.length();i++)  //9 iterations
	       {
	           char c=s.charAt(i); // aabbbcccc   
	           temp[c-'a']++;  //
	       }
	     
	     	     
	       int max=0;
	       for(int i=0;i<26;i++)
	       {
	            if(temp[i]>max)  //(0>4)
	            {
	            	max=temp[i];   //   max=4
	            }
	       }
	       return n-max;  // 9-4 = 5
	       
	   }
	    

	   
		public static void main (String[] args) {
			Scanner sc= new Scanner(System.in);
			String s= sc.nextLine();
		
	         System.out.println(scoreMaximize(s));
		
		}

}
