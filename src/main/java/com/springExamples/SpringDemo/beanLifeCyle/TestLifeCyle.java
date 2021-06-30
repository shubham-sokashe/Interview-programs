package com.springExamples.SpringDemo.beanLifeCyle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * this class is to test the execution of init() and destroy() method
 * */

public class TestLifeCyle {
	
	public static void main(String[] args) {
		System.out.println("Inside TestLifeCycle main method..");
		@SuppressWarnings("resource")
		AbstractApplicationContext cont = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/beanLifeCyle/SpringBeanLCycle.xml");
		System.out.println("Initializing and destroying bean using XMl");
		
		PensileBean pensile = cont.getBean("pensile1", PensileBean.class);
		
		System.out.println("pensile bean : " + pensile);
		
		System.out.println("=====================================================================================================");
		
		System.out.println("Initializing and destroying bean using interface");
		PenBean pen = cont.getBean("pen1" , PenBean.class);
		System.out.println("Pen Bean : " + pen);
		
		System.out.println("=====================================================================================================");
		
		System.out.println("Initializing and destroying bean using annotations");
		MarkerBean marker = cont.getBean("marker1" , MarkerBean.class);
		System.out.println("Marker Bean : " + marker);
		
		
		cont.registerShutdownHook();
		
		
		
	}

}
