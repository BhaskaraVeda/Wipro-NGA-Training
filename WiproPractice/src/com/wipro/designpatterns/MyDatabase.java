package com.wipro.designpatterns;

public class MyDatabase // 1 database 1 object is required
{
	   static MyDatabase instance;
	   
	  public MyDatabase()
	  {
		  // do anything if required
	  }
	    
	   MyDatabase  getDatabaseConnection()
	      {  
		       if(instance==null)
		       {
		    	   instance=new MyDatabase();
		        }
	    	  return instance;
	      }
	   
	   void display()
	   {
		   System.out.println("tetsing the singleten class");
	   }
	   
}
