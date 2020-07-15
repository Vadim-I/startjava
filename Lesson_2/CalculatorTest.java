import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		char calcAgain;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите первое число: ");
			myCalc.setNumber1(scan.nextInt());
			System.out.print("Введите знак математической операции (+, -, *, /, ^, %): ");
			myCalc.setSign(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			myCalc.setNumber2(scan.nextInt());
			System.out.println("Результат вычисления: " + myCalc.calculate());
			do {
				System.out.println("Хотите продолжить? (y / n)");
				calcAgain = scan.next().charAt(0);
			} while((calcAgain != 'y') && (calcAgain != 'n'));
		} while(calcAgain != 'n');
	}
}