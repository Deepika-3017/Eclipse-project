package com.wipro;

//thread class
class T1 implements Runnable{
	public void run() {
		System.out.println("Runnable Thread");
	}
}

//thread
class T2 extends Thread{
	public void run() {
		System.out.println("Runnable Thread");
	}
}

class Emp{
	
}

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java");
		Emp e1= new Emp();//gc
		System.gc();//e1 destroyed
		T2 t2=new T2();//new 1
		t2.start();//2 runnable
//		t2.sleep(5);//interrupted Exception
//		t2.stop();
//		t2.interrupt();
//		t2.suspend();
//		t2.resume();
//		t2.wait();
		T1 t1 = new T1();
		Thread tt1=new Thread(t1);
		tt1.start();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.activeCount());

	}

}

