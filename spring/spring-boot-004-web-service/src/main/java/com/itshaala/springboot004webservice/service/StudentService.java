package com.itshaala.springboot004webservice.service;

import com.itshaala.springboot004webservice.dao.StudentDao;
import com.itshaala.springboot004webservice.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;

    public void create(Student student) {
        studentDao.create(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }

    public Student findById(int id) {
        return studentDao.findById(id);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

}
