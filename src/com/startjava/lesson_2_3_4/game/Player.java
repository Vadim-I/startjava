package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] nums = new int[10];
	private int index = -1;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return nums[index];
	}

	public void setNum(int number) {
		index++;
		nums[index] = number;
	}

	public int[] getNums() {
		return Arrays.copyOf(nums, index+1);
	}

	public int getIndex() {
		return index;
	}

	public void fillNums() {
		Arrays.fill(Arrays.copyOf(nums, nums.length), 0, index+1, 0);
		index = -1;
	}
}