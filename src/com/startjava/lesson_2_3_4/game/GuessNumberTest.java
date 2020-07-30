package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String calcAgain;

		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scan.nextLine());
		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2);

		do {
			game.startGame();
			do {
				System.out.println("Хотите продолжить? (yes / no)");
				calcAgain = scan.nextLine();
			} while ((!calcAgain.equals("yes")) && (!calcAgain.equals("no")));
		} while(!calcAgain.equals("no"));
	}	
}