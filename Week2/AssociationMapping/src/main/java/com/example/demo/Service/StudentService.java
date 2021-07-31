package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {
	
	public void persitStudent(Student stud);
	public List<Student> fetchAllStud() throws Exception;
	public Student delStud(Integer id);
	
}

