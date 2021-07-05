package com.springExamples.SpringDemo.InjectingCollectionUsingAnnotation;

/**
 * Class for details of the Services that user uses
 * @author Shubham Sokashe
 * */


public class UserServices {
	


	private String serivceName;
	
	private String serviceUserName;

	public String getSerivceName() {
		return serivceName;
	}

	public String getServiceUserName() {
		return serviceUserName;
	}

	public void setSerivceName(String serivceName) {
		this.serivceName = serivceName;
	}

	public void setServiceUserName(String serviceUserName) {
		this.serviceUserName = serviceUserName;
	}

	UserServices(String serivceName, String serviceUserName) {
		super();
		this.serivceName = serivceName;
		this.serviceUserName = serviceUserName;
	}
	@Override
	public String toString() {
		return "UserServices [serivceName=" + serivceName + ", serviceUserName=" + serviceUserName + "]";
	}
	

}
