package com.synchdemo;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Display display = new Display();
		Demo demo = new Demo(display);
		Demo demo1 = new Demo(display);

		demo.start();
		demo1.start();

	}

}
