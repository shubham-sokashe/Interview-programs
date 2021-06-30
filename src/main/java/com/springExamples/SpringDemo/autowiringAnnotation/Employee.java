package com.springExamples.SpringDemo.autowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String empName;
	
	private String empId;
	
	@Autowired
	private Company cmp;
	
	
	private WorkStation wkst;

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", \ncmp=" + cmp.getCompanyName() + ", \nwkst=" + wkst.getWorkstationNo() + "]";
	}

	Employee() {
		super();
		System.err.println("Employee bean No arg constructor called ");
	}

	Employee(String empName, String empId, Company cmp, WorkStation wkst) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.cmp = cmp;
		this.wkst = wkst;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public Company getCmp() {
		return cmp;
	}

	public WorkStation getWkst() {
		return wkst;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}
	@Autowired
	public void setWkst(WorkStation wkst) {
		System.err.println("Using Setter Autowired in Employee bean");
		this.wkst = wkst;
	}
	
}
