package com.wipro.filehandlingdemo;

import java.io.File;
import java.io.FileWriter;

public class WriteDemo {

	public static void main(String[] args) {
		String data="Hello world java programming!";
		try {
		FileWriter obj = new FileWriter("myfile1.text");
//	        for(int i=0;i<data.length();i++)
//	        {
	        	obj.write(data);
	       // }
				
	        obj.close();
				System.out.println("file is edited!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
