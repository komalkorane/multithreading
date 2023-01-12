package com.join.method;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
//		t.setPriority(8);
		MyThread1 t1 = new MyThread1();
//		t1.setPriority(10);
		t1.start();
		t.start();
		
//		t.join();
//		t1.join();
//		t.join(10000);
//		t.join(10000, 1000);
//		t1.join(10000, 1000);
		for(int i=0; i<10; i++) {
			System.out.println("Ram Thread!!!");
		}
		
	}

}
