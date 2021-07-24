package com.org;



public class Employee {
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	  public void init()
	   {
	      System.out.println("bean inside init ");
	   }
	   public void destroy() {
	      System.out.println("bean in destroy method");
	   }
	

}
