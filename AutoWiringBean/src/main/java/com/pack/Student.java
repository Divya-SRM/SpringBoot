package com.pack;

public class Student {
	private int RollNo;
	private String Name;
	private String Dob;
private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Dob=" + Dob + "]";
	}

	

}
