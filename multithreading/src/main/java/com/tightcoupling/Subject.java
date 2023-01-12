package com.tightcoupling;

public class Subject {

	static Topic topic;

	public Subject() {
		super();
	}

	public Subject(Topic topic) {
		super();
		this.topic = topic;
	}

	public static void subjectunder() {
		topic.understand();
		System.out.println("Subject ");
	}

}
