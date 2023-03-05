package edu.sabanciuniv.javahw04.service;

import edu.sabanciuniv.javahw04.model.Student;
import edu.sabanciuniv.javahw04.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addNewStudent(Student student) {
      return studentRepository.save(student);
    }

}
