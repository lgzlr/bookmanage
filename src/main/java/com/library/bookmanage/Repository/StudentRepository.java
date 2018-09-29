package com.library.bookmanage.Repository;

import com.library.bookmanage.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {

    Student getStudentByName(String name);
}
