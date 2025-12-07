package com.wipro.filehandlingdemo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFileDemo {

	public static void main(String[] args) {
		try {
			File obj = new File("myfile2.text");
		    Scanner s=new Scanner(obj);
			while(s.hasNextLine())
			{
				String data=s.nextLine();
				System.out.println(data);
				
			}
			s.close();
					
						} catch (Exception e) {
				System.out.println(e);
			}}

}
