package com.wipro.objectsdemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
		int rollno=s.nextInt();
		Employee e1=new Employee();
		
		e1.setEid("1");
		e1.setSalary("90k");
		e1.setDoj("04/09/2024");

		System.out.println("Emp Id :"+ e1.getEid());
		System.out.println("Salary : "+ e1.getSalary());
		System.out.println("Date of Joining : "+ e1.getDoj());
		
//
//		Artist artists[] = new Artist[2]; // assume 500 artist artist id 1 update name
//		Artist a1 = new Artist(1, "atif", "tu jane na");
//		Artist a2 = new Artist(201, "arijit", "naina");
//		artists[0] = a1;
//		artists[1] = a2;
//
//		for (int i = 0; i < artists.length; i++) {
//			if (artists[i].getId() == 1) {
//				artists[i].setName("Atif Aslam");
//				System.out.println(artists[i]);
//			}
//		}

	}
}

class Employee
{
	String eid,salary,doj;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
}

class Artist {
	
	private int id;
	private String name, songname;

	void setName(String name) {
		this.name = name;

	}

	String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongname() {
		return songname;
	}

	public void setSongname(String songname) {
		this.songname = songname;
	}

	public Artist(int id, String name, String songname) {
		this.id = id;
		this.name = name;
		this.songname = songname;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", songname=" + songname + "]";
	}

}

//getter and setters  for each variable/field in your class
// to get the value (return values)
// to set or update th values (void)





////Constructors  -- Class -> Shape
////
////areaof circle    ---> radius
////area of reactangle ---> length,breadth
////area of square      --> side
//
//
//Shape(int side)
//{
//	Print(side*side);
//}
//
//greatestNumber(4,7,5);
//evenOrOdd(4)  -> even or odd
//
//


interface Demo1
{
	void display();// by default is public
}

class Test1 implements Demo1
{

	public void display() {
		
		
	}
	
}












