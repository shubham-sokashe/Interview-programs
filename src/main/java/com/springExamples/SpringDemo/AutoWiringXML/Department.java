package com.springExamples.SpringDemo.AutoWiringXML;


/**
 * Example of Auto wiring using  by type
 * */
public class Department {
	
	private String name;
	
	private Teacher teacher1;

	Department() {
		super();
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher1() {
		return teacher1;
	}

	@Override
	public String toString() {
		return "\nDepartment [name=" + name + ", teacher1=" + teacher1 + "]";
	}

	Department(String name, Teacher teacher1) {
		super();
		this.name = name;
		this.teacher1 = teacher1;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeacher1(Teacher teacher1) {
		this.teacher1 = teacher1;
	}

}
