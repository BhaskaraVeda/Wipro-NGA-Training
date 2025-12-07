package com.wipro.threadsdemo;

 class Counter{
 private int c = 0; // Shared variable

 // Synchronized method to increment counter
 public  synchronized void inc() {
     c++;
 }

 // Synchronized method to get counter value
 public synchronized int get() {
     return c;
 }
}

public class Main1 {
 public static void main(String[] args) {
     Counter cnt = new Counter(); // Shared resource

     // Thread 1 to increment counter
     Thread t1 = new Thread(() -> {
         for (int i = 0; i < 1000; i++) {
             cnt.inc();
         }
     });

     Thread t2 = new Thread(() -> {
      
            System.out.println( cnt.get());
         
     });
     t1.setPriority(10);
     // Start both threads
     t1.start();
     t1.setPriority(5);

     t2.start();
   
     // Wait for threads to finish
   //  try {
//         t1.join();
    // } catch (InterruptedException e) {
      ///   e.printStackTrace();
     //}

     // Print final counter value
   //  System.out.println("Counter: " + cnt.get());
 }
}











///1 . one threads reads the input details of student
//and other thread display those details

//2. you have to display table of entered number usign one thread
//and other thread will find the factorial of a entered number
