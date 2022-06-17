package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@Controller
public class StudentController {
private StudentService studentservice;

public StudentController(StudentService studentservice) {
	super();
	this.studentservice = studentservice;
}
@GetMapping("/students")  //this "students" string is used from browser to hit this method
public String studentList(Model model) {
	model.addAttribute("students",studentservice.getStudentList());   //data from db is returned to the getStudentList method in service class and "students" is used in html  body wheneevr it wants to extract this list dynamically
	return "students";  //students,html is html page
}

@GetMapping("/students/new")
public String createStudent(Model model) {
	Student student =new Student();
	model.addAttribute("student",student);
	return "create_student";
}

@PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student) {
	studentservice.saveStudent(student);
	return "redirect:/students";
	
}

@GetMapping("/students/edit/{id}")
public String editStudentform(@PathVariable Long id ,Model model) {
	model.addAttribute("student", studentservice.getStudentbyId(id));
	return "edit_student";
	
}
@PostMapping("/students/{id}")
public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model){
	
	Student existing = studentservice.getStudentbyId(id);
	existing.setId(id);
	existing.setFirstName(student.getFirstName());
	existing.setLastName(student.getLastName());
	existing.setEmail(student.getEmail());
	
	studentservice.saveStudent(student);
	return "redirect:/students";
}

@GetMapping("/students/{id}")
public String deleteStudent(@PathVariable Long id) {
	studentservice.deleteStudent(id);
	return "redirect:/students";
}
}
