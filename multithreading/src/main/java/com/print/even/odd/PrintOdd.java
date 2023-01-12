package com.print.even.odd;

public class PrintOdd implements Runnable {

	public void run() {
//   System.out.println("Print odd method");	
		for (int i = 1; i <= 100; i++)
			if (i % 2 != 0) {

				System.out.println("Odd no : " + i);}
	}
}
