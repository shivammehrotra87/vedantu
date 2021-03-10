package com.vedantu.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.vedantu.entities.BoardingHouse;
import com.vedantu.entities.Student;
import com.vedantu.interfaces.StudentInterface;
import com.vedantu.service.PrinterService;
import com.vedantu.service.StudentService;

/**
 * Run the code using this Test Class
 * 
 * @author Shivam Input : Data from file TestData
 *
 */

public class RunTest {

	public static void main(String args[]) {
		int capacity = 0;
		int numberOfHouses = 4;
		int rollNumber = -1;
		String className = null;
		String mealType = null;
		BoardingHouse house = new BoardingHouse();
		HashSet<Integer> checkDuplicateRollNumber = new HashSet<Integer>();
		List<Student> students = new ArrayList<Student>();
		StudentInterface studentService = new StudentService();
		PrinterService printer = new PrinterService();

		String dir = System.getProperty("user.dir");
		String fileName = dir + "/src/com/vedantu/data/TestData";

		List<String> list = new ArrayList<String>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
			list = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String data : list) {

			ArrayList<String> initList = new ArrayList<String>(Arrays.asList(data.split(" ")));
			if (initList.get(0).equalsIgnoreCase("init")) {
				capacity = Integer.parseInt(initList.get(1));
				if (capacity % numberOfHouses != 0) {
					System.out.print("House Capacity Should be multiple of" + numberOfHouses);
					return;
				}
				house.init(capacity / 4);

			} else if (initList.get(0).equalsIgnoreCase("reg")) {
				rollNumber = Integer.parseInt(initList.get(1));

				// If Duplicate Roll Number comes in ignore .

				if (!checkDuplicateRollNumber.contains(rollNumber)) {
					className = initList.get(2);
					mealType = initList.get(3);
					Student student = new Student(rollNumber, className, mealType);
					students.add(student);
					checkDuplicateRollNumber.add(rollNumber);

				}

			} else if (initList.get(0).equalsIgnoreCase("fin")) {
				System.out.println("Data Read Complete");

			} else {

				System.out.println("Invalid Input Recieved from file");
				return;

			}

		}
        
		studentService.allocateStudent(students, house);
		printer.printAllocations(house);

	}

}
