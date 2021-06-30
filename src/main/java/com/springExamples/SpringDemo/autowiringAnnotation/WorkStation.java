package com.springExamples.SpringDemo.autowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkStation {

	private String workstationNo;
	
	private String workstationPassword;
	
	
	private Employee emp;

	@Autowired
	WorkStation(String workstationNo, String workstationPassword, Employee emp) {
		super();
		System.err.println("using Autowired contructor into the workstation bean");
		this.workstationNo = workstationNo;
		this.workstationPassword = workstationPassword;
		this.emp = emp;
	}

	WorkStation() {
		super();
	}

	@Override
	public String toString() {
		return "WorkStation [workstationNo=" + workstationNo + ", workstationPassword=" + workstationPassword + ", emp="
				+ emp.getEmpName() + "]";
	}

	public String getWorkstationNo() {
		return workstationNo;
	}

	public String getWorkstationPassword() {
		return workstationPassword;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setWorkstationNo(String workstationNo) {
		this.workstationNo = workstationNo;
	}

	public void setWorkstationPassword(String workstationPassword) {
		this.workstationPassword = workstationPassword;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
