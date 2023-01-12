package com.print.even.odd;

public class PrintEven implements Runnable {

	public void run() {

		for (int i = 1; i <= 100; i++) 
			if (i % 2 == 0) {
				System.out.println("even no : " + i);
			}
		}
}
