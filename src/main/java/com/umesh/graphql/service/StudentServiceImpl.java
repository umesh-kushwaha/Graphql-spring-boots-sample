package com.umesh.graphql.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.umesh.graphql.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	 private Map<String, Student> map = new HashMap<>();
	 
	@Override
	public Student getStudentDetailsByName(String name) {
		return null != name? map.get(name) : null;
	}

	@Override
	public Student createStudentRecord(Student student) {
		if(null != student) {
            map.put(student.getName(), student);
        }
        return student;
	}

}
