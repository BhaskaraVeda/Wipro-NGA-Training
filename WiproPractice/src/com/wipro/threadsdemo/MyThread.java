package com.wipro.threadsdemo;

public class MyThread extends Thread   {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.setName("T1");// state 1
		t1.start();  // state 2
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyThread t2=new MyThread();	
		t2.setName("T2");// state 1
		t2.start();  // state 2
	}

	public void run()
	{
		 if(currentThread().getName()=="T1") {
			 task1();
		 }
		 else if(currentThread().getName()=="T2")
		 {
		 task2();
		 }
		
	}
	
	void task1() {
		for(int i=1;i<=5;i++)
		{
		System.out.println(i+" "+getName());
		}
	}
	void task2()
	{
		for(int i=5;i>=1;i--)
		{
		System.out.println(i+" "+getName());
		}
	}
	
}


//// single resource --->
//---> single bank account -> paytm, gpay
//
//
//
// paytm--> bank account    5000 - 1000 = 4000
// gpay--- bank account  5000

/* Exercise 1 ->Create two threads --- 1 will print table of 5
 //                         2 will table of 25
  Exercise 2->> Create a thread which prints counting from 50 to 80 after 1 sec pause                       
// Exercise 3 -> Create a Singleton class for creating instance of DatabaseDrivers



*/


