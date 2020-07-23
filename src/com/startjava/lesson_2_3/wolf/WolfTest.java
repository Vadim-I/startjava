package com.startjava.lesson_2_3.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.setName("Seryj");
		myWolf.setSex("Man");
		myWolf.setColor("Grey");
		myWolf.setWeight(45);
		myWolf.setAge(4.5f);

		System.out.println("Кличка волка - " + myWolf.getName());
		System.out.println("Пол волка - " + myWolf.getSex());
		System.out.println("Окрас волка - " + myWolf.getColor());
		System.out.println("Вес волка - " + myWolf.getWeight() + " кг");
		System.out.println("Возраст волка - " + myWolf.getAge() + " года");

		myWolf.move();
		myWolf.sit();
		System.out.println(myWolf.run());
		System.out.println(myWolf.howl());
		System.out.println(myWolf.hunt());
	}
}