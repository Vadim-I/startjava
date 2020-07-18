import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		char calcAgain;

		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока: ");
		Player p1 = new Player(scan.nextLine());
		System.out.print("Введите имя второго игрока: ");
		Player p2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(p1, p2);

		do {
			game.startGame();
			do {
				System.out.println("Хотите продолжить? (y / n)");
				calcAgain = scan.next().charAt(0);
			} while((calcAgain != 'y') && (calcAgain != 'n'));
		} while(calcAgain != 'n');
	}	
}