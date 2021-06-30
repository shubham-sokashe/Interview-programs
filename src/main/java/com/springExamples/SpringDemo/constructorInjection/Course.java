package com.springExamples.SpringDemo.constructorInjection;

import java.util.List;

/**
 * this class is for creating bean using constructor injection
 * 
 * */

public class Course {

	private String courseId;
	
	private String courseName;
	
	private String courseDepartment;
	
	private List<Subject> coruseSubject;
	
	

	
	Course(String courseId, String courseName, String courseDepartment, List<Subject> coruseSubject) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDepartment = courseDepartment;
		this.coruseSubject = coruseSubject;
		System.out.println("Course Class constructor invoked..");

	}



	Course() {
		super();
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDepartment=" + courseDepartment
				+ ", coruseSubject=" + coruseSubject + "]";
	}
}
