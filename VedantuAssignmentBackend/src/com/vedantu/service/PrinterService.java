package com.vedantu.service;

import com.vedantu.entities.BoardingHouse;

public class PrinterService {
	
	public void printAllocations(BoardingHouse house) {
		
		System.out.println("Allocated Boarding Houses ");
		
		System.out.print(house.getA_Veg().getClassName() + house.getA_Veg().getMealType() + ": ");
		house.getA_Veg().getQueue().stream().forEach(student -> System.out.print(student.getRollNumber() + " "));
		System.out.println();

		System.out.print(house.getB_Veg().getClassName() + house.getB_Veg().getMealType() + ": ");
		house.getB_Veg().getQueue().stream().forEach(student -> System.out.print(student.getRollNumber() + " "));
		System.out.println();

		System.out.print(house.getA_NonVeg().getClassName() + house.getA_NonVeg().getMealType() + ": ");
		house.getA_NonVeg().getQueue().stream().forEach(student -> System.out.print(student.getRollNumber() + " "));
		System.out.println();

		System.out.print(house.getB_NonVeg().getClassName() + house.getB_NonVeg().getMealType() + ": ");
		house.getB_NonVeg().getQueue().stream().forEach(student -> System.out.print(student.getRollNumber() + " "));
		System.out.println();

		System.out.print(house.getNA().getClassName() + ": ");
		house.getNA().getQueue().stream().forEach(student -> System.out.print(student.getRollNumber() + " "));
		
	}

}
