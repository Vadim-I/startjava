import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		char calcAgain;
		
		Player playerOne = new Player();
		Player playerTwo = new Player();
		GuessNumber game = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите имя первого игрока: ");
		playerOne.setName(scan.nextLine());
		System.out.print("Введите имя второго игрока: ");
		playerTwo.setName(scan.nextLine());

		do {
			game.setPcNum((int)(Math.random()*101));
			do {
				System.out.print("Введите число первого игрока: ");
				game.setPlayerNum(scan.nextInt());
				game.play();
				if(game.getPlayerNum() != game.getPcNum()) {
					System.out.print("Введите число второго игрока: ");
					game.setPlayerNum(scan.nextInt());
					game.play();
				}
			} while(game.getPlayerNum() != game.getPcNum());
			do {
				System.out.println("Хотите продолжить? (y / n)");
				calcAgain = scan.next().charAt(0);
			} while((calcAgain != 'y') && (calcAgain != 'n'));
		} while(calcAgain != 'n');
	}	
}