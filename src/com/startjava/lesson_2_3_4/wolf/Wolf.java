package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
	private String name;
	private String sex;
	private String color;
	private int weight;
	private float age;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	public float getAge() {
		return age;
	}

	void setAge(float age) {
		if(age > 8.0f) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void move() {
		System.out.println("Волк может ходить");
	}

	public void sit() {
		System.out.println("Волк может сидеть в засаде");
	}

	public boolean run() {
		System.out.println("Волк быстро бегает");
		return true;
	}

	public boolean howl() {
		System.out.println("Волк часто воет");
		return false;
	}

	public String hunt() {
		System.out.println("Волк умеет охотиться");
		return "основная добыча - зайцы";
	}
}