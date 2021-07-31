package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;


@RestController
public class MyController extends BaseController  {
	@Autowired
	private StudentService service;
	
	@PutMapping(value="/student",produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<List<Student>> addStudent(@Valid @RequestBody Student stud)
	{

		service.persitStudent(stud);
		return new ResponseEntity<List<Student>>(HttpStatus.OK);
		
	}
	
	
	@PostMapping(value="/student",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> updateStudent(@Valid @RequestBody Student stud) throws Exception
	{
		service.persitStudent(stud);
		return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/studentadd",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getStudent(@RequestBody Student stud) throws Exception
    {
        return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.OK);
    }
	@DeleteMapping(value="/student/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudent(@PathVariable Integer id)
    {
        service.delStud(id);
    }
}
