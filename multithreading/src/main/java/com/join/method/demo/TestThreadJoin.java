package com.join.method.demo;

public class TestThreadJoin {

	public static void main(String[] args) throws InterruptedException {

		MyThread1.mt1=Thread.currentThread();
		
		
		 MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t2.start();
//		t2.join();
		t1.start();
//		t1.join();
		
//		System.out.println(Thread.currentThread().getName());
		
	     for(int i=0;i<5;i++) {
	    	 
	    	 System.out.println("main Thread");
	     }
		
		
		
	}

}
