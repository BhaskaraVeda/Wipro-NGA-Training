package com.wipro.designpatterns;

/*package whatever //do not write package name here */

import java.io.*;

// Library classes
abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

// Client (or user) class
class ClientFactory {
    private Vehicle pVehicle;

    Vehicle getVehicle(int type)
    {
        if (type == 2) {
            pVehicle = new TwoWheeler();
        } else if (type == 4) {
            pVehicle = new FourWheeler();
        } else {
            pVehicle = null;
        }
        return pVehicle;
    }
  
    public Vehicle getVehicle() {
        return pVehicle;
    }
}
// Driver program
public class Test {
    public static void main(String[] args) {
        ClientFactory pClient = new ClientFactory();
        int x=2;
        Vehicle pVehicle = pClient.getVehicle(x);
          pVehicle.printVehicle();
    }
}


//Shape abstract class with area method()
// extends by Circle,Rectangle classes



