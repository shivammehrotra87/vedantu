package com.vedantu.entities;

public class Student {
	
	int rollNumber;
	public Student(int rollNumber, String classAllocation, String mealType) {
		super();
		this.rollNumber = rollNumber;
		this.classAllocation = classAllocation;
		this.mealType = mealType;
	}
	String classAllocation;
	String mealType;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getClassAllocation() {
		return classAllocation;
	}
	public void setClassAllocation(String classAllocation) {
		this.classAllocation = classAllocation;
	}
	public String getMealType() {
		return mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	

}
