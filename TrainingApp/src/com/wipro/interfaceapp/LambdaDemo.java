package com.wipro.interfaceapp;

@FunctionalInterface
interface Arith{
	int op(int a,int b);
	//int add(int a,int b,int c);
	
}
class ArithImpl implements Arith{
	public int op(int a,int b) {
		return a+b;
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith ar=new ArithImpl();
		System.out.println(ar.op(5, 6));

	}

}
