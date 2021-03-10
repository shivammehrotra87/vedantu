package com.vedantu.interfaces;

import java.util.List;

import com.vedantu.entities.BoardingHouse;
import com.vedantu.entities.Student;

public interface AllocationInterface {
	
	
	public void allocateBoards(List<Student> student);

	void allocateBoards(List<Student> student, BoardingHouse house);
	

}
