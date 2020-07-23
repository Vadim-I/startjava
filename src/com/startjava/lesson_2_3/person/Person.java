package com.startjava.lesson_2_3.person;

public class Person {

	String name = "Pavel";
	String sex = "Man";
	float height = 1.84f;
	float weight = 88.5f;
	int age = 29;

	void move() {
		System.out.println("Pavel может ходить");
	}

	void sit() {
		System.out.println("Pavel может сидеть");
	}

	boolean run() {
		System.out.println("Pavel сейчас бежит");
		return true;
	}

	void speak() {
		System.out.println("Pavel умеет говорить");
	}

	String learnJava() {
		System.out.println("Pavel учит Java");
		return "At the beginning";
	}
}