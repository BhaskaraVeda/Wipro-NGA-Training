package com.wipro.corejava;

import java.util.Scanner;

import com.wipro.methods.MethodsDemo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String languages[] = new String[3]; // 3
		
			languages[0] = "java";
			languages[1] = "c++";
			languages[2] = "python";
		//	languages[3] = "c#";
	
		System.out.println("stored array elements:");

		for (int i = 0; i < languages.length; i++)
			System.out.println(languages[i]);

	}

}
/*
 * 
 * 
 * 
 * int numbers[]= {2,3,5,6,7,83,24,56}; char vowels[]= { 'a','e', 'i' , 'o' ,
 * 'u'}; String colors[]= {"red", "blue" ,"green"}; for(int i=0 ;
 * i<colors.length ; i++) System.out.println(colors[i]);
 */