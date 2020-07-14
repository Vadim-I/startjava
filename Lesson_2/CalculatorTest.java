import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
	    Calculator myCalc = new Calculator();
		char calcAgain = '0';

		while(calcAgain != 'n') {
			System.out.print("Введите первое число: ");
		    Scanner scan0 = new Scanner(System.in);
			myCalc.number1 = scan0.nextInt();
			System.out.print("Введите знак математической операции (+, -, *, /, ^, %): ");
			Scanner scan1 = new Scanner(System.in);
			myCalc.sign = scan1.next().charAt(0);
			System.out.print("Введите второе число: ");
		    Scanner scan2 = new Scanner(System.in);
			myCalc.number2 = scan2.nextInt();

			System.out.println("Результат вычисления: " + myCalc.calcResult(myCalc.number1, myCalc.number2, myCalc.sign));
			System.out.println("Хотите продолжить? (y / n)");
			Scanner scan3 = new Scanner(System.in);
			calcAgain = scan3.next().charAt(0);
			while((calcAgain != 'y') & (calcAgain != 'n')) {
				System.out.println("Хотите продолжить? (y / n)");
				Scanner scan4 = new Scanner(System.in);
				calcAgain = scan4.next().charAt(0);
			}
		} 
	}
}