package com.wipro.filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FilesDemo {

	public static void main(String[] args) {
		File obj = new File("myfile2.text");
	
			if (obj.exists())
			{
				System.out.println("file name "+obj.getName());
				System.out.println("file path "+obj.getAbsolutePath());
				System.out.println("file can write? "+obj.canWrite());
				System.out.println("file can read? "+obj.canRead());
				System.out.println("file size... "+obj.length());
			}
			else
				System.out.println("file not  found!");
		} 
	
}

