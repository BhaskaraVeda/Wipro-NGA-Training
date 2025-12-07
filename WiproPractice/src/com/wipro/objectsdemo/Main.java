package com.wipro.objectsdemo;

import com.wipro.methods.Iphone;
import com.wipro.methods.Mobile;
import com.wipro.objectsdemo.Outerclass.Innerclass;

public class Main extends Mobile {

	public static void main(String[] args) {
	    
		Iphone apple=new Iphone();
		apple.displaylocal();	
		
		Main m=new Main();
		m.message();
		Student s1=new Student("sakshi", "123");
		System.out.println(s1);
		//Object
//		
//		Outerclass o=new Outerclass();
//		o.display();
//		Student s=new Student(null, null);
//		
//		
//		System.out.println(o instanceof Outerclass);
//		System.out.println(s instanceof Student);
//		
//		
////		  Outerclass.Innerclass i=o.new Innerclass();
////		  i.display();

	}

}




//Practice session is going on!














