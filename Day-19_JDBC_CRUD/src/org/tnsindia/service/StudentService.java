package org.tnsindia.service;

import java.util.List;

import org.tnsindia.entities.Student;

public interface StudentService {
	
	public boolean AddStudent(Student s);
	public boolean DeleteStudent(int rollno);
	public Student updateStudent(Student s);
	public Student GetStudent(int ROLL_NO);
	public List<Student>GetStudents();

}
