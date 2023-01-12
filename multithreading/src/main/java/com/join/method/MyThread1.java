package com.join.method;

public class MyThread1 extends Thread {

	static MyThread1 t1;
	
	public void run() {
		
		try {
          t1.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=0; i<10; i++) {
			System.out.println("Laxman Thread!!!!");
		}
}
}
