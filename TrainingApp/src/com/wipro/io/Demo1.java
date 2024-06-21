package com.wipro.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1= new FileInputStream("home\\rps:\\Hello.java");
		FileOutputStream f2=new FileOutputStream("home\\rps:\\output.txt");
		
		int k;
		
		while((k=f1.read())!=-1)
		{
			System.out.print((char)k);
			f2.write((char)k);
		}
		
		f1.close();
		f2.close();

	}

}
