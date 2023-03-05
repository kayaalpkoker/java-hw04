package edu.sabanciuniv.javahw04.repository;

import edu.sabanciuniv.javahw04.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
