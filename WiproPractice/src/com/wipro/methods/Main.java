package com.wipro.methods;

public class Main {

	public static void main(String[] args) {
        Phone1 obj=new Apple();
        obj.call();   // better approach
        
        Apple obj1=new Apple();
        obj1.call();
	}

}
interface Phone1
{   
	void call();
}

class Apple implements Phone1
{

	@Override
	public void call() {
		System.out.println("call is installed!");
	}

	
	
}


abstract class Shapes
{
	
	void demo()
	{
		
	}
	 abstract void method();
	
}

class Rect extends Shapes
{

	@Override
	void method() {
		// TODO Auto-generated method stub
		
	}
	
}



//		Shape shape1=new Shape(4.1f);
//		shape1=new Shape(8);
//		shape1=new Shape(4,6);

//		Learners l1=new Learners("Sakshi",400);
//		Learners l2=new Learners("Rahul",300);
//		Learners l3=new Learners("Reethika",450);
//		
//		   l1.CalculatingMarks();
//		   l2.CalculatingMarks();
//		   l3.CalculatingMarks();







