package com.springExamples.SpringDemo.AutoWiringXML;

/**
 * Example of autowiring by name 
 * 
 * */

public class College {
	
	private String name;

	private Department dept1;
	
	private String collegeId;



	College() {
		super();
	}


	public String getName() {
		return name;
	}


	public Department getDept1() {
		return dept1;
	}


	public String getCollegeId() {
		return collegeId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}


	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}


	@Override
	public String toString() {
		return "College [name=" + name + ", dept1=" + dept1 + ", collegeId=" + collegeId + "]";
	}
}
