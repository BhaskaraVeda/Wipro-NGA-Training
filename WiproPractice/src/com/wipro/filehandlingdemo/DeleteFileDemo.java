package com.wipro.filehandlingdemo;

import java.io.File;
import java.util.Scanner;

public class DeleteFileDemo {

	public static void main(String[] args) {
		try {
			File obj = new File("myfile2.text");
		if(obj.delete())
		{
			System.out.println("deleted!");
		}
					
						} catch (Exception e) {
				System.out.println(e);
			}}

	}


