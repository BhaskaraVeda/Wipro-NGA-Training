package com.wipro.corejava;

import java.util.Scanner;

public class GradesDemo {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in); 
		
		System.out.println("enter your marks");
		int marks=scan.nextInt();
	if(marks>450)      // Above 450
		System.out.println("Grade : A+");
	else if(marks>400 && marks<=450)        //  between 401 to 450
		System.out.println("Grade : A");
	else if(marks>350 && marks<=400)        //  between 400 to 350
		System.out.println("Grade : B");
	else if(marks>=250 && marks<=350)
		System.out.println("Grade : C");
	else 
		System.out.println("Grade : D");
}
}
