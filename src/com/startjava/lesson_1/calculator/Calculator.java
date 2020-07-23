package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
	    int number1 = 52;
	    int number2 = 4;
	    int result = 0;
	    char sign = '/';

	    if(sign == '+') {
	    	result = number1 + number2;
	    } else if(sign == '-') {
	    	result = number1 - number2;
	    } else if(sign == '*') {
	    	result = number1 * number2;
	    } else if(sign == '/') {
	    	result = number1 / number2;
	    } else if(sign == '^') {
	    	result = 1;
	    	for(int i = 1; i <= number2; i++) {
	    		result *= number1;
	    	}
	    } else if(sign == '%') {
	    	result = number1 % number2;
	    }
	    System.out.println("Результат вычисления: " + result);
	}
}