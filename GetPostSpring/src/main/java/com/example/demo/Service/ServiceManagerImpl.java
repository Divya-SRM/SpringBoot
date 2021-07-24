package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Student;
@Service
public class ServiceManagerImpl implements ServiceManager {
	
	List<Student> mystudents=new ArrayList<>();
	@Override
	public List<String> getName()
	{
		return Arrays.asList("Divya","mani","preethi");
	}

	@Override
	public void persitStudent(Student stud) {
		mystudents.add(stud);
		
	}
	@Override
	public List<Student> fetchAllStud() {
		return mystudents;
	}

	

}
