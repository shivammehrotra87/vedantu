package com.vedantu.interfaces;

import java.util.List;

import com.vedantu.entities.BoardingHouse;
import com.vedantu.entities.Student;

public interface StudentInterface {

	public void addStudent(List<Student> student);
	public void deleteStudent(List<Student> student);
	void allocateStudent(List<Student> student);
	public void allocateStudent(List<Student> students, BoardingHouse house);
}
