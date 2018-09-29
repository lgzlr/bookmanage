package com.library.bookmanage.Service;

import com.library.bookmanage.Repository.StudentRepository;
import com.library.bookmanage.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentByName(String name) {

        Student student = studentRepository.findStudentByName(name);
        return student;
    }
}
