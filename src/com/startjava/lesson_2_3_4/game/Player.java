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

	public void setNums(int numb) {
		this.nums[index] = numb;
	}

	public int getNums(int index) {
		return nums[index];
	}

	public int[] getArrayNums() {
		return nums;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void fillNums(int i) {
		Arrays.fill(nums, 0, i+1, 0);
	}
}