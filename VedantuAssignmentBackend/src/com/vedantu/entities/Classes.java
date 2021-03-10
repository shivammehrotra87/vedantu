package com.vedantu.entities;

import java.util.LinkedList;
import java.util.Queue;

public class Classes {
	
	String className;
	String mealType;
	Queue<Student> queue ;
	
	
	public Classes(String className,String mealType,Queue<Student> queue) {
		this.className=className;
		this.mealType=mealType;
		this.queue=queue;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getMealType() {
		return mealType;
	}


	public void setMealType(String mealType) {
		this.mealType = mealType;
	}


	public Queue<Student> getQueue() {
		return queue;
	}


	public void setQueue(Queue<Student> queue) {
		this.queue = queue;
	}
	

}
