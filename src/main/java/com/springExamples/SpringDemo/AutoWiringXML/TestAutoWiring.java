package com.springExamples.SpringDemo.AutoWiringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to test the autowiring using the xml file
 * 
 * 
 * */

public class TestAutoWiring {

	public static void main(String[] args) {
		System.out.println("College Bean wired to the Department using the byName");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/AutoWiringXML/springAutoWiring.xml");
		
		College clg = context.getBean("college1" , College.class);
		
		System.out.println("college : " + clg);
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("constructor autowire :");
		
		Student stu1 = context.getBean("stu1" , Student.class);
		
		System.out.println("student : " + stu1);
	}
	
}
