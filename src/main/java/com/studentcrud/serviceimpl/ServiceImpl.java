package com.studentcrud.serviceimpl;

import com.studentcrud.entity.Student;
import com.studentcrud.repository.StudentRepository;
import com.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getById(int id){
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
