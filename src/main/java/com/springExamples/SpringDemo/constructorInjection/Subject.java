package com.springExamples.SpringDemo.constructorInjection;

/**
 * this class is for creating bean using constructor injection
 * */

public class Subject {
	
	private String subjectId;
	
	private String subjectName;

	Subject(String subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		System.out.println("Subject Class constructor invoked..");
	}

	Subject() {
		super();
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	

	
}
