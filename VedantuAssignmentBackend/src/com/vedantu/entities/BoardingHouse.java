package com.vedantu.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import static com.vedantu.constants.Constants.*; 

public class BoardingHouse {
	
	List<Classes> classes;
	int capacity;
	Classes A_Veg;
	Classes B_Veg;
	Classes A_NonVeg;
	Classes B_NonVeg;
	Classes NA;
	
	public void init(int capacity) {
		this.capacity=capacity;
		A_Veg= new Classes(CLASS_NAME_A,MEAL_TYPE_VEG,new LinkedList<Student>());
		A_NonVeg= new Classes(CLASS_NAME_A,MEAL_TYPE_NONVEG,new LinkedList<Student>());
		B_Veg= new Classes(CLASS_NAME_B,MEAL_TYPE_VEG,new LinkedList<Student>());
		B_NonVeg= new Classes(CLASS_NAME_B,MEAL_TYPE_NONVEG,new LinkedList<Student>());
		NA =new Classes(CLASS_NAME_NA,"",new LinkedList<Student>());
		
		
	}
	
	public List<Classes> getClasses() {
		return classes;
	}
	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Classes getA_Veg() {
		return A_Veg;
	}

	public void setA_Veg(Classes a_Veg) {
		A_Veg = a_Veg;
	}

	public Classes getB_Veg() {
		return B_Veg;
	}

	public void setB_Veg(Classes b_Veg) {
		B_Veg = b_Veg;
	}

	public Classes getA_NonVeg() {
		return A_NonVeg;
	}

	public void setA_NonVeg(Classes a_NonVeg) {
		A_NonVeg = a_NonVeg;
	}

	public Classes getB_NonVeg() {
		return B_NonVeg;
	}

	public void setB_NonVeg(Classes b_NonVeg) {
		B_NonVeg = b_NonVeg;
	}

	public Classes getNA() {
		return NA;
	}

	public void setNA(Classes nA) {
		NA = nA;
	}
	
	

}
