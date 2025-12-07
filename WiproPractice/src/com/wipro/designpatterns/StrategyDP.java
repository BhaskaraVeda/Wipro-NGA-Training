package com.wipro.designpatterns;

public class StrategyDP {

	public static void main(String[] args) {
	
		Strategy s1=new OperationSubtract();
		Context obj1=new Context(s1);
		Context obj2=new Context(new OperationMultiply());
		Context obj3=new Context(new OperationAdd());
	
//	example	       int x= add(2,5);
//	System.out.println(x);    or    System.out.println(add(4,5));
		 
	System.out.println(obj1.executeStrategy(10, 5));
	System.out.println(obj2.executeStrategy(3, 5));
	System.out.println(obj3.executeStrategy(2, 6));

	}

}

interface Strategy {
	   public int doOperation(int num1, int num2);
	}

class OperationAdd implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;// alogrithm is for addition
	   }
	}

class OperationSubtract implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;// alogrithm is for subtraction
	   }
	}

class OperationMultiply implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 * num2;// alogrithm is for multiplication
	   }
	}

class Context {
	   private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy; // Operation
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}




