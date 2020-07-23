package com.startjava.lesson_2_3.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private String status;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, String status, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.status = status;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public String getStatus() {
		return status;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public void move() {
		System.out.println("Jaeger прошел 10 шагов");
	}

	public void attack() {
		System.out.println("Jaeger атакует Kaiju");
	}

	public String scanKaiju() {
		System.out.println("Jaeger ищет Kaiju");
		return "result: nothing";
	}
}