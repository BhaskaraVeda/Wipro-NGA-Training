package com.wipro.corejava;

public class Add {
 public static void main(String a[]) {
	
	 Add obj=new Add();
	System.out.println (obj.add(3, 4));
	 
}
 
  public  int add(int x,int y)
    {
//	    x=x/0; 
    	return x+y;
    }
  public  int sub(int x,int y)
  {
  	return x-y;
  }
}
