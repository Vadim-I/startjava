package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int number;
	private int[] nums = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setNums(int i, int n) {
		this.nums[i] = n;
	}

	public int[] getNums() {
		return nums;
	}

	public void arrayFill(int i) {
		Arrays.fill(nums, 0, i+1, 0);
	}
}