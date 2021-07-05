package com.springExamples.SpringDemo.InjectingCollectionUsingAnnotation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Class is to configure the Bean Container
 * 
 * @author Shubham Sokashe
 */

@Configuration
@ComponentScan(basePackages = "com.springExamples.SpringDemo.InjectingCollectionUsingAnnotation")
public class ConfigurationClass {

	// creating set of Emails
	@Bean("userEmails")
	public Set<String> getuserEmails(){
		String email1 = "abc@gmail.com";
		String email2 = "userxyz@hotmail.com";
		Set <String> emailSet = new HashSet<>();
		emailSet.add(email1);
		emailSet.add(email2);
		return emailSet;
	}

	// creating List of contact nos
	@Bean
	public List<Long> getuserContactNos(){
		Long mobile1 = 1234567890l;
		Long mobile2 = 9876543210l;
		Long mobile3 = 1122334455l;
		List<Long> contactList = new ArrayList<>();
		contactList.add(mobile1);
		contactList.add(mobile2);
		contactList.add(mobile3);
		return contactList;
	}
	
	@Bean
	@Order(1)
	public UserServices getSerivce1() {
		return new UserServices("Gmail" , "gmailUser");
	}
	
	@Bean
	@Order(3)
	public UserServices getSerivce2() {
		return new UserServices("Driver" , "GDriverUser");
	}
	
	@Bean
	@Order(2)
	public UserServices getSerivce3() {
		return new UserServices("Youtube" , "YoutubeUser");
	}
}
