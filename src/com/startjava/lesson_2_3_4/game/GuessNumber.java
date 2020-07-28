package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private Player player1;
	private Player player2;
	private int pcNum;
	private int[] masOfNumbers1 = new int[10];
	private int[] masOfNumbers2 = new int[10];
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
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
			masOfNumbers1[i] = scan.nextInt();
            player1.setMasOfNumbers(masOfNumbers1);
			if (masOfNumbers1[i] > pcNum) {
				System.out.println("Это число больше того, что загадал компьютер.");
			} else if (masOfNumbers1[i] < pcNum) {
				System.out.println("Это число меньше того, что загадал компьютер.");
			} else {
				System.out.println("Игрок " + player1.getName() + " угадал число " + pcNum + " с " + (i+1) + " попытки!");
				break;
			}
            if ((i == 9) && (masOfNumbers1[i] != pcNum)) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки.");
            }
			if (masOfNumbers1[i] != pcNum) {
			    System.out.print("Введите число второго игрока: ");
			    j++;
				masOfNumbers2[j] = scan.nextInt();
                player2.setMasOfNumbers(masOfNumbers2);
				if (masOfNumbers2[j] > pcNum) {
					System.out.println("Это число больше того, что загадал компьютер.");
				} else if (masOfNumbers2[j] < pcNum) {
					System.out.println("Это число меньше того, что загадал компьютер.");
				} else {
					System.out.println("Игрок " + player2.getName() + " угадал число " + pcNum + " с " + (i+1) + " попытки!");
					break;
				} 
			}
            if ((j == 9) && (masOfNumbers2[j] != pcNum)) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки.");
            }
		} while((i < 9) && (j < 9));
		Arrays.fill(masOfNumbers1, 0, i, 0);
		Arrays.fill(masOfNumbers2, 0, j, 0);
        System.out.println("Введенные игроками числа:");
		System.out.println(Arrays.toString(Arrays.copyOf(player1.getMasOfNumbers(), i+1)));
        System.out.println(Arrays.toString(Arrays.copyOf(player2.getMasOfNumbers(), j+1)));
	}
}