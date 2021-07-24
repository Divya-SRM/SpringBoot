package com.pack;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[])
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Student student = (Student)context.getBean("stud1");
	System.out.println("AutoWiring");
	student.setRollNo(7010);
	student.setName("Divya");
	student.setDob("9/8/97");
	System.out.println(""+student+student.getDepartment());
	Student studentbyType=(Student)context.getBean("stud2");
	System.out.println("\nAutowiring ByType");
	System.out.println(studentbyType.getDepartment());
}
}
