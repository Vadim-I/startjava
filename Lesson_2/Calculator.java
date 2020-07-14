public class Calculator {
	int number1;
	int number2;
	int result;
	char sign;

	int calcResult(int number1, int number2, char sign) {
		switch (sign) {
		    case '+':	result = number1 + number2;
		    			break;
		    case '-':	result = number1 - number2;
		    			break;
		    case '*':	result = number1 * number2;
		    			break;
		    case '/':	result = number1 / number2;
		    			break;
		    case '^':	result = 1;
		    			for(int i = 1; i <= number2; i++) {
		    		  		result *= number1;
		    		  	}
		    		  	break;
		    case '%':	result = number1 % number2;
		    			break;
		} return result;
	}
}