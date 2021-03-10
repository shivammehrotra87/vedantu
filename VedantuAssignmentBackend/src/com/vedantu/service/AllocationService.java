package com.vedantu.service;

import java.util.List;

import com.vedantu.constants.Constants;
import com.vedantu.entities.BoardingHouse;
import com.vedantu.entities.Student;
import com.vedantu.interfaces.AllocationInterface;
/**
 * Allocates Students to boarding houses
 * @author Shivam
 *
 */
public class AllocationService implements AllocationInterface {

	@Override
	public void allocateBoards(List<Student> students, BoardingHouse house) {

		for (Student student : students) {
			if (student.getMealType().equalsIgnoreCase(Constants.MEAL_TYPE_VEG)
					&& student.getClassAllocation().equalsIgnoreCase(Constants.CLASS_NAME_A)) {
				if (!(house.getA_Veg().getQueue().size() == house.getCapacity()))
					house.getA_Veg().getQueue().add(student);
				else {
					house.getNA().getQueue().add(student);
				}

			} else if (student.getMealType().equalsIgnoreCase(Constants.MEAL_TYPE_NONVEG)
					&& student.getClassAllocation().equalsIgnoreCase(Constants.CLASS_NAME_A)) {
				if (!(house.getA_NonVeg().getQueue().size() == house.getCapacity()))
					house.getA_NonVeg().getQueue().add(student);
				else {
					house.getNA().getQueue().add(student);
				}

			} else if (student.getMealType().equalsIgnoreCase(Constants.MEAL_TYPE_VEG)
					&& student.getClassAllocation().equalsIgnoreCase(Constants.CLASS_NAME_B)) {
				if (!(house.getB_Veg().getQueue().size() == house.getCapacity()))
					house.getB_Veg().getQueue().add(student);
				else {
					house.getNA().getQueue().add(student);
				}

			} else if (student.getMealType().equalsIgnoreCase(Constants.MEAL_TYPE_NONVEG)
					&& student.getClassAllocation().equalsIgnoreCase(Constants.CLASS_NAME_B)) {
				if (!(house.getB_NonVeg().getQueue().size() == house.getCapacity()))
					house.getB_NonVeg().getQueue().add(student);
				else {
					house.getNA().getQueue().add(student);
				}

			} 
		}

	}

	@Override
	public void allocateBoards(List<Student> student) {
		// TODO Auto-generated method stub

	}

}
