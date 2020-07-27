package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", "Destroyed", 76.2f, 1.722f, 9, 8, 6);
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", "Destroyed", 76.2f, 1.850f, 10, 10, 9);
		
		System.out.println("modelName 1 = " + crimsonTyphoon.getModelName());
		System.out.println("status of " + crimsonTyphoon.getModelName() + " is " + crimsonTyphoon.getStatus());
		System.out.println("speed = " + crimsonTyphoon.getSpeed());
		System.out.println("strength = " + crimsonTyphoon.getStrength());
		System.out.println("modelName 2 = " + strikerEureka.getModelName());
		System.out.println("status of " + strikerEureka.getModelName() + " is " + strikerEureka.getStatus());
		System.out.println("speed = " + strikerEureka.getSpeed());
		System.out.println("strength = " + strikerEureka.getStrength());
		crimsonTyphoon.move();
		crimsonTyphoon.attack();
		System.out.println(strikerEureka.scanKaiju());
	}
}