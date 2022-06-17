package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication

public class StudentmanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Vidhya", "Sridharan", "vsri@gmail.com");
		 * studentRepository.save(student1); Student student2 = new Student("Vijay",
		 * "S", "vgov@gmail.com"); studentRepository.save(student2); Student student3 =
		 * new Student("Prasanna", "G", "psri@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
