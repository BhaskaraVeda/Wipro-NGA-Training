//package com.wipro.threadsdemo;
//
//import com.wipro.filehandlingdemo.Student;
//
//public class Main extends Student implements Runnable{
//	 static Thread t1;
//	public static void main(String[] args) {
//	     Main m1=new Main();
//	      t1=new  Thread(m1);
//	     t1.start();
//	}
//	
//	@Override
//	public void run() {
//		for(int i=1;i<=5;i++)
//		{
//		try {
//		t1.sleep(2000);  // 2000 miliseconds means 2 sec
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		} 
//		System.out.println(i+" "+t1.getName());
//		}
//		
//	}
//
//}
//
//
//
//
////Thread  (all other thread method)   , Runnable ( run() )
//
