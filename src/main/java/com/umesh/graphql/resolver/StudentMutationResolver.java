package com.umesh.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.umesh.graphql.model.Student;
import com.umesh.graphql.service.StudentService;

@Component
public class StudentMutationResolver  implements GraphQLMutationResolver
{
    @Autowired
    private StudentService studentService;

    public Student createStudent (Student student) {
        return studentService.createStudentRecord(student);
    }
}