package com.umesh.graphql.service;

import com.umesh.graphql.model.Student;

public interface StudentService {

	 public Student getStudentDetailsByName(String name);

	 public Student createStudentRecord(Student student);
}
