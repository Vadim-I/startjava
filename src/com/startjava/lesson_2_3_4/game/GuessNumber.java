package com.startjava.lesson_2_3_4.game;

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
		pcNum = (int) (Math.random() * 101);
		System.out.println("Начинаем игру. У вас 10 попыток.");
		while(player1.getIndex() < 9) {
			enterNum(player1);
			if(compareNums(player1)) {
				break;
			}
			enterNum(player2);
			if(compareNums(player2)) {
				break;
			}
		}
		printNums(player1);
		printNums(player2);
		player1.fillNums();
		player2.fillNums();
	}

	private void enterNum(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число игрока " + player.getName() + ": ");
		player.setNum(scan.nextInt());
	}

	private boolean compareNums(Player player) {
		if (player.getNum() > pcNum) {
			System.out.println("Это число больше того, что загадал компьютер.");
		} else if (player.getNum() < pcNum) {
			System.out.println("Это число меньше того, что загадал компьютер.");
		} else {
			System.out.println("Игрок " + player.getName() + " угадал число " + pcNum + " с " + (player.getIndex()+1) + " попытки!");
			return true;
		}
		if ((player.getIndex() == 9) && (player.getNum() != pcNum)) {
			System.out.println("У игрока " + player.getName() + " закончились попытки.");
		}
		return false;
	}

	private void printNums(Player player) {
		System.out.println("Введенные игроком " + player.getName() + " числа:");
		for(int number : player.getNums()) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
