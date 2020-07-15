public class Calculator {
	private int number1;
	private int number2;
	private int result;
	private char sign;

	public int getNumber1() {
		return number1;
	}

	void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	void setNumber2(int number2) {
		this.number2 = number2;
	}

	public char getSign() {
		return sign;
	}

	void setSign(char sign) {
		this.sign = sign;
	}

	int calculate(int number1, int number2, char sign) {
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
		} return result;
	}
}