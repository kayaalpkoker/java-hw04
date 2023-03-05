package edu.sabanciuniv.javahw04.controller;

import edu.sabanciuniv.javahw04.model.Student;
import edu.sabanciuniv.javahw04.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity<Student> addNewStudent (@RequestBody Student student) {
        return new ResponseEntity<>(studentService.addNewStudent(student), CREATED);
    };

}
