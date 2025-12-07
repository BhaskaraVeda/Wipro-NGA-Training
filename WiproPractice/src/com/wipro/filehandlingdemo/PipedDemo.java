package com.wipro.filehandlingdemo;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedDemo {

	public static void main(String[] args) {
		try {
		PipedReader reader=new PipedReader();
	    PipedWriter writer=new PipedWriter();
	    
		reader.connect(writer);
		writer.write('a');
		System.out.println("reading data :"+(char)reader.read());
		writer.write(65);
		System.out.println("reading data :"+(char)reader.read());
		
	} catch (Exception e) {
		System.out.println(e);
	}
	

	}

}
