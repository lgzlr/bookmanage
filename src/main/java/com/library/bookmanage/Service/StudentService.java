package com.library.bookmanage.Service;

import com.library.bookmanage.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentService {

    void saveStudent(Student student);

    Student findStudentByName(String name);
}
