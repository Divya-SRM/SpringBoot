package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.example.demo.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	List<Student> mystudents=new ArrayList<>();

	@Override
	public void persitStudent(Student stud) {
		mystudents.add(stud);
	}

	@Override
	public List<Student> fetchAllStud()throws Exception
	 {
		if(mystudents.isEmpty())
		{
			throw new RuntimeException();
		}
		return mystudents;
	}

	@Override
	public Student delStud(Integer id) {
		Iterator<Student> iterator=mystudents.iterator();
		while(iterator.hasNext())
		{
			Student s=iterator.next();
			if(s.getId()==id)
			{
				iterator.remove();
				return s;
			}
		}
		return null;
	}
	
	

	
}
