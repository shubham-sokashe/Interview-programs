package com.springExamples.SpringDemo.Bean;

import java.util.Map;

public class Student {
	
	private String studentId;
	
	private String studentName;
	
	private Address studentAddress;
	
	private Map<String , Integer> subjects;





	public Map<String , Integer> getSubjects() {
		return subjects;
	}



	public void setSubjects(Map<String , Integer> subjects) {
		this.subjects = subjects;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", subjects=" + subjects + "]";
	}



	public Address getStudentAddress() {
		return studentAddress;
	}



	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}



	Student() {
		super();
	}

	

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


}
