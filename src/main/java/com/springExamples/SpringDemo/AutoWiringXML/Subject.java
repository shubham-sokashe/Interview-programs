package com.springExamples.SpringDemo.AutoWiringXML;

public class Subject {
	
	private String name ;
	
	private String id;

	Subject() {
		super();
	}

	Subject(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

}
