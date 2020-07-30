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
		int index = -1;
		System.out.println("Начинаем игру. У вас 10 попыток.");
		while(index < 9) {
			index++;
			enterNums(player1, index);
			if(compareNums(player1, index)) {
				break;
			}
			enterNums(player2, index);
			if(compareNums(player2, index)) {
				break;
			}
		}
		System.out.println("Введенные игроками числа:");
		printNums(player1);
		printNums(player2);
		fillNums(player1);
		fillNums(player2);
	}

    private void enterNums(Player player, int index) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число игрока " + player.getName() + ": ");
		player.setNum(scan.nextInt(), index);

	}

	private boolean compareNums(Player player, int index) {
		if (player.getNum(index) > pcNum) {
			System.out.println("Это число больше того, что загадал компьютер.");
		} else if (player.getNum(index) < pcNum) {
			System.out.println("Это число меньше того, что загадал компьютер.");
		} else {
			System.out.println("Игрок " + player.getName() + " угадал число " + pcNum + " с " + (index+1) + " попытки!");
			return true;
		}
		if ((index == 9) && (player.getNum(index) != pcNum)) {
			System.out.println("У игрока " + player.getName() + " закончились попытки.");
		}
		return false;
	}

    private void printNums(Player player) {
		System.out.println(Arrays.toString(Arrays.copyOf(player.getNums(), player.getIndex()+1)));
    }

    private void fillNums(Player player) {
		Arrays.fill(player.setNums(player.getNums()), 0, player.getIndex()+1, 0);
    }
}
