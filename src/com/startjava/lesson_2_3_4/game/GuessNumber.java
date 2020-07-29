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

	public void startGame() {
		pcNum = (int)(Math.random() * 101);
		int i = 0;
		System.out.println("Начинаем игру. У вас 10 попыток.");
		do {
			compareNums(player1, i);
			if (player1.getNums(player1.getIndex()) != pcNum) {
				compareNums(player2, i);
			}
			i++;
		} while(((player1.getIndex() < 9) && (player2.getIndex() < 9)) &&
			(player1.getNums(player1.getIndex()) != pcNum) &&
			(player2.getNums(player2.getIndex()) != pcNum));
		System.out.println("Введенные игроками числа:");
		System.out.println(Arrays.toString(Arrays.copyOf(player1.getArrayNums(), player1.getIndex()+1)));
		System.out.println(Arrays.toString(Arrays.copyOf(player2.getArrayNums(), player2.getIndex()+1)));
		player1.fillNums(player1.getIndex());
		player2.fillNums(player2.getIndex());
	}

	public void compareNums(Player player0, int index0) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число игрока " + player0.getName() + ": ");
		player0.setIndex(index0);
		player0.setNums(scan.nextInt());
		if (player0.getNums(player0.getIndex()) > pcNum) {
			System.out.println("Это число больше того, что загадал компьютер.");
		} else if (player0.getNums(player0.getIndex()) < pcNum) {
			System.out.println("Это число меньше того, что загадал компьютер.");
		} else if (player0.getNums(player0.getIndex()) == pcNum) {
			System.out.println("Игрок " + player0.getName() + " угадал число " + pcNum + " с " + (index0+1) + " попытки!");
		}
		if ((index0 == 9) && (player0.getNums(player0.getIndex()) != pcNum)) {
			System.out.println("У игрока " + player0.getName() + " закончились попытки.");
		}
	}
}
