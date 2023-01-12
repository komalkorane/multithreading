package com.join.method.demo;

public class MyThread1 extends Thread {

	static Thread mt1;

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("thread 1 !!");
		}
//		try {
//			mt1.start();
//		} catch (Exception e) {
//			System.out.println("Exception occurred ");
		}

	

}
