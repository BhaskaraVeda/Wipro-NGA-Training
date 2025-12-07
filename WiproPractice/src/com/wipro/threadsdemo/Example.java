package com.wipro.threadsdemo;

public class Example extends Thread {

	public Example(String name, ThreadGroup group)
	{
		super(group,name);
	}

	public static void main(String[] args) {
		   ThreadGroup group=new ThreadGroup("group1");
			
		Example thread1 = new Example("t1",group); // Thread1 is created
		Example thread2 = new Example("t2",group); // Thread2 is created
		
		
	    thread1.setPriority(MAX_PRIORITY);
		thread1.start(); 
	     try {
			thread1.join();
		} catch (InterruptedException e) {
		}
	     thread2.setPriority(MIN_PRIORITY);
		
		thread2.start(); //      thread1-----joined ---thread2
	}

	public void run() {
            if(currentThread().getName().equals("t1"))
            {
            	counting();
            }
            else if(currentThread().getName().equals("t2"))
            {
            	reverseCounting();
            }
            
	}

	void counting() {
		for (int i = 1; i <= 10; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(i+ " "+currentThread().getName());
		}
	}

	void reverseCounting() {
		for (int i = 10; i >= 1; i--)
			System.out.println(i+ " "+currentThread().getName());

	}

}
