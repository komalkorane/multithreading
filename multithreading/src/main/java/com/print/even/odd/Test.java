package com.print.even.odd;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		PrintEven pe = new PrintEven();
		Thread t1 = new Thread(pe);
		t1.start();

		PrintOdd po = new PrintOdd();
		Thread t2 = new Thread(po);
		t2.sleep(2000);
		t2.start();

	}

}
