package com.springExamples.SpringDemo.AutoWiringXML;

/**
 * Example of Autowiring constructor
 * */

public class Teacher {
	
	private String name;
	
	private String subject;
	
	private String TeacherId;

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public String getTeacherId() {
		return TeacherId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
	}

	Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "\nTeacher [name=" + name + ", subject=" + subject + ", TeacherId=" + TeacherId + "]";
	}

	Teacher(String name, String subject, String teacherId) {
		super();
		this.name = name;
		this.subject = subject;
		TeacherId = teacherId;
	}
	
	

}
