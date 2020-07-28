package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] masOfNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMasOfNumbers(int[] masOfNumbers) {
		this.masOfNumbers = Arrays.copyOf(masOfNumbers, masOfNumbers.length);
	}

	public int[] getMasOfNumbers() {
		return Arrays.copyOf(masOfNumbers, masOfNumbers.length);
	}
}