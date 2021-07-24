package com.student;

public class Department {
	private String deptname;
	private String section;
	public Department() {
		super();
		
	}
	
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", section=" + section + "]";
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
