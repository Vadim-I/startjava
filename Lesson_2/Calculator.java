public class Calculator {
	private int number1;
	private int number2;
	private int result;
	private char sign;

	void setNumber1(int number1) {
		this.number1 = number1;
	}

	void setNumber2(int number2) {
		this.number2 = number2;
	}

	void setSign(char sign) {
		this.sign = sign;
	}

	int calculate() {
		switch (sign) {
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
			case '^':
				result = 1;
				for(int i = 1; i <= number2; i++) {
					result *= number1;
				}
				break;
			case '%':
				result = number1 % number2;
				break;
		} 
		return result;
	}
}