package com.umesh.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.umesh.graphql.model.Student;
import com.umesh.graphql.service.StudentService;

@Component
public class StudentQueryResolver  implements GraphQLQueryResolver{
   
	@Autowired
    private StudentService studentService;

    public Student student (String name)
    {
        return studentService.getStudentDetailsByName(name);
    }
}