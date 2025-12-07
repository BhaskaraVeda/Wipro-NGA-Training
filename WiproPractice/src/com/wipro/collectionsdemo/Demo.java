package com.wipro.collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap();

		map.put(1,new Student("sakshi",22));
		map.put(2,new Student("yukti",12));
		map.put(3, new Student("reethika",13));
		            //key    , Value
		for(Map.Entry<Integer, Student>   obj : map.entrySet())
		{
		System.out.println(obj.getKey()+"  "+obj.getValue());
//		Student s=obj.getValue();
//		System.out.println(s.getName()+" "+s.getRollno());
		}
		
		
	}

}

// Practice Session is going on!











