package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private Player player1;
	private Player player2;
	private int pcNum;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void compareNums(int number1, int number2, int index, String name1) {
		if (number2 > number1) {
			System.out.println("Это число больше того, что загадал компьютер.");
		} else if (number2 < number1) {
			System.out.println("Это число меньше того, что загадал компьютер.");
		} else {
			System.out.println("Игрок " + name1 + " угадал число " + number1 + " с " + (index+1) + " попытки!");
		}
		if ((index == 9) && (number2 != number1)) {
			System.out.println("У игрока " + name1 + " закончились попытки.");
		}
	}

	public void startGame() {
		Scanner scan = new Scanner(System.in);
		int i = -1;
		int j = -1;

		pcNum = (int)(Math.random() * 101);
		System.out.println("Начинаем игру. У вас 10 попыток.");
		do {
			System.out.print("Введите число первого игрока: ");
			i++;
			player1.setNumber(scan.nextInt());
			player1.setNums(i, player1.getNumber());
			compareNums(pcNum, player1.getNumber(), i, player1.getName());
			if(player1.getNumber() == pcNum) {
				break;
			}
			if (player1.getNumber() != pcNum) {
				System.out.print("Введите число второго игрока: ");
				j++;
				player2.setNumber(scan.nextInt());
				player2.setNums(j, player2.getNumber());
				compareNums(pcNum, player2.getNumber(), j, player2.getName());
				if(player2.getNumber() == pcNum) {
					break;
				}
			}
		} while((i < 9) && (j < 9));
		System.out.println("Введенные игроками числа:");
		System.out.println(Arrays.toString(Arrays.copyOf(player1.getNums(), i+1)));
		System.out.println(Arrays.toString(Arrays.copyOf(player2.getNums(), j+1)));
		player1.arrayFill(i);
		player2.arrayFill(j);
	}
}
