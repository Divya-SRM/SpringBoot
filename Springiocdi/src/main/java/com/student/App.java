package com.student;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student stud =(Student)context.getBean("student1");
		System.out.println(stud);
		Student stud1=(Student)context.getBean("student1");
		System.out.println("Department :"+stud1.getDepartment().getDeptname());
		System.out.println("Section :"+stud1.getDepartment().getSection());
		String CollegeName=stud.getCollege().getCollegename();
        System.out.println("College Name :"+CollegeName);
		
    }
}
		


