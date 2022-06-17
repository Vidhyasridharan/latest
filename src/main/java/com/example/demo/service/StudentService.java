package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	List<Student> getStudentList();
	Student saveStudent(Student student);
	Student getStudentbyId(Long id);
	void deleteStudent(Long id);
}
