package com.library.bookmanage.Controller.Student;

import com.library.bookmanage.Service.StudentService;
import com.library.bookmanage.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save")
    public void save(){

        Student student = new Student();
        student.setName("Tom");
        student.setAge("18");
        student.setGender("male");
        studentService.saveStudent(student);
    }

    @RequestMapping(value = "/find")
    public Student find(){

        String studentName = "Tom";
        Student student = studentService.findStudentByName(studentName);
        return student;
    }

}
