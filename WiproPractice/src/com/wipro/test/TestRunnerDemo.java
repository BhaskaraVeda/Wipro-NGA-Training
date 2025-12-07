package com.wipro.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerDemo {

	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(TestMessage.class);
		 
		 for( Failure obj: result.getFailures())
		 {
			 System.out.println("Failure:"+obj);
		 }
		 
		 
		 System.out.println("success: ");

		 
	}

}
