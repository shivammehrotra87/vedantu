package com.vedantu.service;

import java.util.List;

import com.vedantu.entities.BoardingHouse;
import com.vedantu.entities.Student;
import com.vedantu.interfaces.StudentInterface;

public class StudentService implements StudentInterface {

	
	@Override
	public void allocateStudent(List<Student> student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(List<Student> student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStudent(List<Student> student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void allocateStudent(List<Student> students, BoardingHouse house) {
		// TODO Auto-generated method stub
		AllocationService allocationService= new AllocationService();
		allocationService.allocateBoards(students, house);
		
		
	}

}
