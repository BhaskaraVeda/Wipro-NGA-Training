package com.wipro.filehandlingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class ReaderDemo {

	public static void main(String[] args) {
		
		try {
			Reader obj = new FileReader("myfile2.text");
		     
			int i=obj.read();//-1 when no data // 74
			System.out.println(i);
			while(i!=-1) {
			System.out.print((char)i); 
			   i=obj.read();
			}
			obj.close();
						} catch (Exception e) {
				System.out.println(e);
			}}

	}


