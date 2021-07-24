package com.example.demo.Service;

import java.util.List;

import com.example.demo.vo.Student;

public interface ServiceManager {
	public List<String> getName();
	public void persitStudent(Student stud);
	public List<Student> fetchAllStud();

}
