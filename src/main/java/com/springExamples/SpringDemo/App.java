package com.springExamples.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExamples.SpringDemo.Bean.Employee;
import com.springExamples.SpringDemo.Bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inside Main method" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Student stu1 = (Student)context.getBean("student1");
        System.out.println("student info : " + stu1);
       System.out.println("---------------------");
       
       Employee emp1 = (Employee)context.getBean("emp1");
       System.out.println("employee details : " + emp1);
       
    }
}
