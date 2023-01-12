package com.synchdemo;

public class Demo extends Thread {

	Display d;

	public Demo() {
		super();
	}

	public Demo(Display d) {
		super();
		this.d = d;
	}

	public void run() {
		d.display();
		System.out.println("Run method ");
	}
}
