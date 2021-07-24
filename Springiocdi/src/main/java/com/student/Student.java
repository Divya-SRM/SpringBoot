package com.student;

public class Student {
	private int stuid;
	private String stuname;
	 private College college;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(College college) {
		super();
	      System.out.println("Inside Student constructor." );
	      this.college = college;
	}
	public void init()
	{
		System.out.println("Init");
	}
	 
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + "]";
	}
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public College getCollege() {
		return college;
	}
	
	

}
