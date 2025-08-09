package com.umesh.graphql.service;

import com.umesh.graphql.model.Address;
import com.umesh.graphql.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    private StudentServiceImpl studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentServiceImpl();
    }

    @Test
    void createStudentRecord() {
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Anytown");
        address.setZipcode("12345");

        Student student = new Student();
        student.setName("Test Student");
        student.setAge(20);
        student.setPhone("123-456-7890");
        student.setAddress(address);

        Student createdStudent = studentService.createStudentRecord(student);

        assertNotNull(createdStudent);
        assertEquals("Test Student", createdStudent.getName());
        assertEquals(student, createdStudent);
    }

    @Test
    void getStudentDetailsByName_whenStudentExists() {
        // First, create a student
        Address address = new Address();
        address.setStreet("456 Oak Ave");
        address.setCity("Someplace");
        address.setZipcode("67890");

        Student student = new Student();
        student.setName("Existing Student");
        student.setAge(25);
        student.setPhone("098-765-4321");
        student.setAddress(address);
        studentService.createStudentRecord(student);

        // Now, get the student by name
        Student foundStudent = studentService.getStudentDetailsByName("Existing Student");

        assertNotNull(foundStudent);
        assertEquals("Existing Student", foundStudent.getName());
        assertEquals(25, foundStudent.getAge());
        assertEquals(student, foundStudent);
    }

    @Test
    void getStudentDetailsByName_whenStudentDoesNotExist() {
        Student foundStudent = studentService.getStudentDetailsByName("Non Existent Student");
        assertNull(foundStudent);
    }
}
