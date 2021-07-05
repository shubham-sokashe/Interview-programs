package com.springExamples.SpringDemo.InjectingCollectionUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class to test 
 * @author Shubham Sokashe
 * */
public class TestInjection {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new  AnnotationConfigApplicationContext(ConfigurationClass.class);
		UserBean user = context.getBean("UserBean" , UserBean.class);
		System.out.println(user);
		
	}

}
