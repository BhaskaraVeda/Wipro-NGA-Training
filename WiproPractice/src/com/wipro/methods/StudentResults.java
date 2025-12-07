package com.wipro.methods;

import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) {
		int a=20;
		Marks m=new Marks();
		Scanner s=new Scanner(System.in);
		String name;
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter rollno");
		String rollno=s.next();
		int m1,m2,m3;
		System.out.println("enter marks for 3 subjects");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		m.readDetails(name,rollno);
		m.readMarks(m1,m2,m3);
		
		m.displayDetails();
		m.displayMarks();

	}

}
