package com.wipro.java8features;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		String colors[]= new String[5] ; // null
		
    Optional<String> obj=Optional.ofNullable(colors[3]);
	if(obj.isPresent())
	{
		System.out.println(colors[3].toLowerCase());	
	}
	else {
		System.out.println("not initialized");	
	}
		

	}

}
