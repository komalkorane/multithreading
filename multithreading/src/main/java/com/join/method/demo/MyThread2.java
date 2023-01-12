package com.join.method.demo;

public class MyThread2 extends Thread {

	static MyThread1 t1;
	
	
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("thread 2 !!");
		}
		try {
//			t1.start();
			t1.join();
		} catch (Exception e) {
//			System.out.println("Exception occurred ");
		}

	}

}
