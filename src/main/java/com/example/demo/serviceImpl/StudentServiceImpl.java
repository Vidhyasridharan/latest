package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Transactional
@Service
public class StudentServiceImpl implements StudentService{
private StudentRepository studentrepository;

public StudentServiceImpl(StudentRepository studentrepository) {
	super();
	this.studentrepository = studentrepository;
}

@Override
public List<Student> getStudentList() {
	// TODO Auto-generated method stub
	return studentrepository.findAll();
}

@Override
public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	return studentrepository.save(student);
}

@Override
public Student getStudentbyId(Long id) {
	// TODO Auto-generated method stub
	return studentrepository.findById(id).get();
}

@Override
public void deleteStudent(Long id) {
	 studentrepository.deleteById(id);
	
}

}
