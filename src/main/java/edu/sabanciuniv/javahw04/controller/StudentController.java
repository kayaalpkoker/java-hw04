package edu.sabanciuniv.javahw04.controller;

import edu.sabanciuniv.javahw04.model.Student;
import edu.sabanciuniv.javahw04.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

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
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return new ResponseEntity<>(studentService.findAllStudents(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findStudentById (@PathVariable Long id) {
        return new ResponseEntity<>(studentService.findStudentById(id), OK);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(OK);
    }


}
