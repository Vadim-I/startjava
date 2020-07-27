package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

	private int pcNum;
	private Player p1;
	private Player p2;
	
	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
				
	public void startGame() {
		Scanner scan = new Scanner(System.in);
		
		pcNum = (int)(Math.random() * 101);
		while(true) {
			System.out.print("Введите число первого игрока: ");
			p1.setNumber(scan.nextInt());
			if (p1.getNumber() > pcNum) {
				System.out.println("Это число больше того, что загадал компьютер.");
			} else if (p1.getNumber() < pcNum) {
				System.out.println("Это число меньше того, что загадал компьютер.");
			} else {
				System.out.println("Число угадано! Выиграл первый игрок - " + p1.getName());
				break;
			} 
			if (p1.getNumber() != pcNum) {
				System.out.print("Введите число второго игрока: ");
				p2.setNumber(scan.nextInt());
				if (p2.getNumber() > pcNum) {
					System.out.println("Это число больше того, что загадал компьютер.");
				} else if (p2.getNumber() < pcNum) {
					System.out.println("Это число меньше того, что загадал компьютер.");
				} else {
					System.out.println("Число угадано! Выиграл второй игрок - " + p2.getName());
					break;
				} 
			}
		}
	}
}