package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		System.out.println("Singleton");
		Employee emp=(Employee)context.getBean("bid");
		emp.setEmpid(13);
		emp.setEmpname("Divya");
		System.out.println("\nEmployee name: "+emp.getEmpname()+"\n Employee Id: "+emp.getEmpid());
		Employee emp1=(Employee)context.getBean("bid");
		System.out.println("\nEmployee name: "+emp1.getEmpname()+"\nEmployee Id: "+emp1.getEmpid());
		System.out.println("\nPrototype");
		Employee emp2=(Employee)context.getBean("bid1");
		emp2.setEmpid(14);
		emp2.setEmpname("pavi");
		System.out.println("\nEmployee name: "+emp2.getEmpname()+"\nEmployee Id: "+emp.getEmpid());
		Employee emp3=(Employee)context.getBean("bid1");
		System.out.println("\nEmployee name: "+emp3.getEmpname()+"\nEmployee Id: "+emp3.getEmpid());
		Employee emp4=(Employee)context.getBean("bid1");
		emp4.setEmpid(15);
		emp4.setEmpname("Mani");
		System.out.println("\nEmployee name: "+emp4.getEmpname()+"\nEmployee Id: "+emp4.getEmpname());
	}

}
