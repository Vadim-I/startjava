package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int result;
	private String mathExpression;

	public void setMathExpression(String mathExpression) {
		this.mathExpression = mathExpression;
	}

	int calculate() {
		String[] splitMathExpression = mathExpression.split(" ");
		int number1 = Integer.parseInt(splitMathExpression[0]);
		char sign = splitMathExpression[1].charAt(0);
		int number2 = Integer.parseInt(splitMathExpression[2]);

		switch (sign) {
			case '+':
				result = Math.addExact(number1, number2);
				break;
			case '-':
				result = Math.subtractExact(number1, number2);
				break;
			case '*':
				result = Math.multiplyExact(number1, number2);
				break;
			case '/':
				result = number1 / number2;
				break;
			case '^':
				result = (int) Math.pow(number1, number2);
				break;
			case '%':
				result = number1 % number2;
				break;
		}
		return result;
	}
}