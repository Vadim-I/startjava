public class Calculator {
	public static void main(String[] args) {

	    int number1 = 52, number2 = 4, result = 0;
	    char operSign = '/';

	    if(operSign == '+') {
	    	result = number1 + number2;
	    } else if(operSign == '-') {
	    	result = number1 - number2;
	    } else if(operSign == '*') {
	    	result = number1 * number2;
	    } else if(operSign == '/') {
	    	result = number1 / number2;
	    } else if(operSign == '^') {
	    	result = 1;
	    	for(int i = 1; i <= number2; i++) {
	    		result = result * number1;
	    	}
	    } else if(operSign == '%') {
	    	result = number1 % number2;
	    }
	    System.out.println("Результат вычисления: " + result);
	}
}