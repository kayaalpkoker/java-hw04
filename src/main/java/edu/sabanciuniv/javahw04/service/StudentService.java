package edu.sabanciuniv.javahw04.service;

import edu.sabanciuniv.javahw04.model.Student;
import edu.sabanciuniv.javahw04.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student addNewStudent(Student student) {
      return studentRepository.save(student);
    }
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
    public Student findStudentById(Long id) {
        return studentRepository.findById((id)).
                orElseThrow(() -> new RuntimeException("Student not found."));
    }
}
