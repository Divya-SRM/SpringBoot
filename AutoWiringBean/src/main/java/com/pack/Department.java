package com.pack;

public class Department {
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	

}
