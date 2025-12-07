package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.wipro.corejava.Add;

@RunWith(Parameterized.class)
public class DemoTest {
	
	static Add obj;
	  @Before   //it gets executed before each test case
	  public void display()
	  {
	
		 System.out.println("@before method");
	  }
	
	  @AfterClass   //it gets executed before each test case
	  public static void end()
	  {
	
		 System.out.println("@After class");
	  }
	  
	  @After   //it gets executed before each test case
	  public void checkAfter()
	  {
	
		 System.out.println("@After method");
	  }
	  
	  @BeforeClass  //it gets executed before each test case
	  public static void check()
	  { 	 obj=new Add();
		 System.out.println("@before class ");
	  }
	 
	  
	  @Test(expected = ArithmeticException.class)  // test case1
	public void testAdd()
	{
		
	assertEquals(9,obj.add(4,5));	
	assertEquals(10,obj.add(9,1));	
	assertEquals(15,obj.add(10,5));	
	}
	
	@Test     // test case2
	public void testAdd(int x, int y)
	{
	assertEquals(4,obj.sub(14,10));	
	assertEquals(8,obj.sub(9,1));	
	assertEquals(5,obj.sub(10,5));	
	}
	
	
	@Parameterized.Parameters
	public Collection getValue()
	{
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Test");
		 list.add("Exceptions");
		 list.add("File handling");
		 
		return list;
	}
	
	// practice is going on!
}
