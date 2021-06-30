package com.springExamples.SpringDemo.AutoWiringXML;

/**
 * Example of Autowiring
 * */

public class Student {

	private String name ;
	
	private String id;
	
	private Subject sub;
	
	private College clg ;
	
	private Department dept;

	Student(String name, String id, Subject sub, College clg, Department dept) {
		super();
		this.name = name;
		this.id = id;
		this.sub = sub;
		this.clg = clg;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Subject getSub() {
		return sub;
	}

	public College getClg() {
		return clg;
	}

	public Department getDept() {
		return dept;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ",\n sub=" + sub.getName() + ",\n clg=" + clg.getName() + ",\n dept=" + dept.getName() + "]";
	}
	
	
	
}
