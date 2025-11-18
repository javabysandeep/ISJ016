package com.itshaala.springboot004webservice.controller;

import com.itshaala.springboot004webservice.model.Student;
import com.itshaala.springboot004webservice.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        studentService.create(student);
        return ResponseEntity.created(URI.create("/students/" + student.getId())).build();
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student) {
        studentService.update(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") int id) {
        return studentService.findById(id);
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public List<Student> findAll() {
        return studentService.findAll();
    }

}
