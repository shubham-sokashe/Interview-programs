package com.springExamples.SpringDemo.BeanScope;
/**
 * Example for scope of the Bean
 * Scope = prototype
 * */
public class Department {
	
	private String name  ;
	
	private String college;

	Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", college=" + college + "]";
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
