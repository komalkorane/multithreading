package com.join.method;

public class MyThread extends Thread{

	static MyThread t;
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Seeta Thread!!!!");
			try {
                t.join();
			}catch(InterruptedException e) {
				
			}
		}
		
	}
	
}
