package com.wipro.net;
import java.io.*;
import java.net.Socket;

public class HelloClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost", 5000);

		String str1 = "Hello Server, How do you do";
		
		OutputStream ostream = s.getOutputStream();
		
		DataOutputStream dos = new DataOutputStream(ostream);
		
		dos.writeBytes(str1);

		dos.close();
		ostream.close();
		s.close();

	}

}
