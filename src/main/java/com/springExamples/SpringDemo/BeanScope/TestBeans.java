package com.springExamples.SpringDemo.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to test The scope of bean
 * */
public class TestBeans {
	
	public static void main(String[] args) {
		
		System.out.println("Inside TestBeans main method..");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/BeanScope/BeanScope.xml" );
		College clg = context.getBean("college1" , College.class);
		
		System.out.println("Singleton Bean Instance of college  :  " + clg.hashCode());
		System.out.println("Singleton Bean Instance of college  :  " + clg.hashCode());
		System.out.println("Singleton Bean Instance of college  :  " + clg.hashCode());
		
		System.out.println("------------------------------------------------------------------------------------");
		
		Department dept = context.getBean("dept1" , Department.class);
		
		Department dept2 = context.getBean("dept1" , Department.class);

		Department dept3 = context.getBean("dept1" , Department.class);
		
		System.out.println("Prototype Bean Instance of Department  :  " + dept.hashCode());
		System.out.println("Prototype Bean Instance of Department  :  " + dept2.hashCode());
		System.out.println("Prototype Bean Instance of Department  :  " + dept3.hashCode());
		
	}

}
