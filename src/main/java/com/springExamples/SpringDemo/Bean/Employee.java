package com.springExamples.SpringDemo.Bean;

import java.util.List;
import java.util.Set;

public class Employee {
	
	private String employeeName;
	
	private String employeeId;
	
	private String employeeDepartment;
	
	private Set<Address> employeeAddresses;
	
	private List<String> employeeAssets;

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public Set<Address> getEmployeeAddresses() {
		return employeeAddresses;
	}

	public List<String> getEmployeeAssets() {
		return employeeAssets;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public void setEmployeeAddresses(Set<Address> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public void setEmployeeAssets(List<String> employeeAssets) {
		this.employeeAssets = employeeAssets;
	}

	Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment="
				+ employeeDepartment + ", employeeAddresses=" + employeeAddresses + ", employeeAssets=" + employeeAssets
				+ "]";
	}

	Employee(String employeeName, String employeeId, String employeeDepartment, Set<Address> employeeAddresses,
			List<String> employeeAssets) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
		this.employeeAddresses = employeeAddresses;
		this.employeeAssets = employeeAssets;
	}

	
	
}
