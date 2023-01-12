package com.tightcoupling;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main started");
		Topic t = new Topic();
		Subject s = new Subject(t);

		s.subjectunder();

		System.out.println("Main Ended");

	}

}
