package com.wipro.methods;

public class Learners {

	private String name; // this
	private int marks; // this

	public Learners(String name, int marks) {
		this.name = name; // name is having the name
		this.marks = marks; // marks is having the lcode
	}

	public void CalculatingMarks() {
		if (marks > 400)
			System.out.println("Student has passed");
		else
			System.out.println("Student has failed");
	}

}




    
