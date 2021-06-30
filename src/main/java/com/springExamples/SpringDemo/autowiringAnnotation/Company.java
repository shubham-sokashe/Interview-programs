package com.springExamples.SpringDemo.autowiringAnnotation;


/**
 * Example of Autowire using annotation
 * */
public class Company {

	private String companyName;
	
	private String companyId;

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyId=" + companyId + "]";
	}

	Company() {
		super();
	}

	Company(String companyName, String companyId) {
		super();
		this.companyName = companyName;
		this.companyId = companyId;
	}
	
	
	
}
