package com.excelr.students.service.impl;

import java.util.List;

import com.excelr.students.entity.Student;
import com.excelr.students.service.StudentService;
import org.springframework.stereotype.Service;

import com.excelr.students.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
