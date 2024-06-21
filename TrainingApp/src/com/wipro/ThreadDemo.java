package com.wipro;


class T3 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
		}
		
		T3 t1=new T3();
		t1.setName("wipro1");
		T3 t2=new T3();
		t2.setName("wipro2");
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
	}

}
