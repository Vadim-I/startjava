package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int pcNum = 77;
		int playerNum = 83;
		
		System.out.println("Компьютер загадал число: " + pcNum);
		System.out.println("Введенное вами число: " + playerNum);
		do {
			if (playerNum > pcNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNum--;
				System.out.println("Вновь введенное число: " + playerNum);
			} else if (playerNum < pcNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNum++;
				System.out.println("Вновь введенное число: " + playerNum);
			} 
		} while(playerNum != pcNum);
		System.out.println("Вы угадали!");	
	}	
}