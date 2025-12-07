package com.wipro.threadsdemo;

public class Demo extends Thread {

   private static final Demo lock = new Demo(); // A lock object for synchronization
    private static int amount = 5000;

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.setName("D1");
        d2.setName("D2");
        d1.start();
        d2.start();
    }

    @Override
    public void run() {
        if (currentThread().getName().equals("D1")) {
            withdraw(6000); 
        } else if (currentThread().getName().equals("D2")) {
            deposit(3000);
        }
    }

     private void deposit(int money) {
       synchronized (lock) {
            System.out.println("Deposit started");
            amount += money;
            System.out.println("Money deposited successfully");
            lock.notify(); // Notify waiting thread
            System.out.println("Thread is notified and waiting is over");
        }
    }

      void withdraw(int money) {
       synchronized (lock) {
            while (money > amount) { 
                System.out.println("Thread went to waiting state for deposit");
                try {
                    lock.wait(); // Wait for the deposit to happen
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            amount -= money;
            System.out.println("Withdraw is successful");
        }
    }
}
