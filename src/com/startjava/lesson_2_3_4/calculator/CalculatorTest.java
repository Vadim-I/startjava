package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalc = new Calculator();
		String calcAgain;

		do {
			System.out.print("Введите мат. выражение в формате: 2 + 12 (знаки +, -, *, /, ^, %): ");
			myCalc.setMathExpression(scan.nextLine());
			System.out.println("Результат вычисления: " + myCalc.calculate());
			do {
				System.out.println("Хотите продолжить? (yes / no)");
				calcAgain = scan.nextLine();
			} while ((!calcAgain.equals("yes")) && (!calcAgain.equals("no")));
		} while(!calcAgain.equals("no"));
	}
}