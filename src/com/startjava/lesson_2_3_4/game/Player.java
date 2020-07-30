package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] nums = new int[10];
	private int index;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNum(int index) {
		return nums[index];
	}

	public void setNum(int number, int index) {
		this.nums[index] = number;
		this.index = index;
	}

	public int[] getNums() {
		return Arrays.copyOf(nums, nums.length);
	}

	public int[] setNums(int[] nums) {
		this.nums = nums;
		return nums;
	}

	public int getIndex() {
		return index;
	}
}