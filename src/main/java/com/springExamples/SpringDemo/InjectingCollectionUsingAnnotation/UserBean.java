package com.springExamples.SpringDemo.InjectingCollectionUsingAnnotation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * This is class having details of the user
 * @author Shubham Sokashe
 * */

@Component(value = "UserBean")
public class UserBean {
	
	@Value("User101")
	private String UserName;
	
	@Value("user1Password")
	private String password;
	
	@Autowired(required = false)
	private Set<String> emails;
	
	@Autowired(required = false)
	private List<Long> contactNo;
	
	@Autowired(required = false)
	private Set<UserServices> services;

	
	public Set<UserServices> getServices() {
		return services;
	}

	public void setServices(Set<UserServices> services) {
		this.services = services;
	}

	public String getUserName() {
		return UserName;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public List<Long> getContactNo() {
		return contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public void setContactNo(List<Long> contactNo) {
		this.contactNo = contactNo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User Details : UserName= " + UserName + ", password=" + password + ", \nemails=" + emails + ", \ncontactNo="
				+ contactNo + ", \nservices=" + services + "";
	}

	UserBean() {
		super();
	}

	

}
