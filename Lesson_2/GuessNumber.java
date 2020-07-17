import java.util.Scanner;

public class GuessNumber {

	private int pcNum;
	
	public GuessNumber(int pcNum) {
		this.pcNum = pcNum;
	}
				
	public void startGame() {
		char calcAgain;
		Player p1 = new Player("Misha", 0);
		Player p2 = new Player("Grisha", 0);
		Scanner scan = new Scanner(System.in);

		do {
			pcNum = (int)(Math.random()*101);
			do {
				System.out.print("Введите число первого игрока: ");
				p1.setNumber(scan.nextInt());
				if (p1.getNumber() > pcNum) {
					System.out.println("Введенное число больше того, что загадал компьютер.");
				} else if (p1.getNumber() < pcNum) {
					System.out.println("Введенное число меньше того, что загадал компьютер.");
				} else {
					System.out.println("Число угадано! Выиграл первый игрок - " + p1.getName());
				} 
				if(p1.getNumber() != pcNum) {
					System.out.print("Введите число второго игрока: ");
					p2.setNumber(scan.nextInt());
					if (p2.getNumber() > pcNum) {
						System.out.println("Введенное число больше того, что загадал компьютер.");
					} else if (p2.getNumber() < pcNum) {
						System.out.println("Введенное число меньше того, что загадал компьютер.");
					} else {
						System.out.println("Число угадано! Выиграл второй игрок - " + p2.getName());
					} 
				}
			} while((p1.getNumber() != pcNum) && (p2.getNumber() != pcNum));
			do {
				System.out.println("Хотите продолжить? (y / n)");
				calcAgain = scan.next().charAt(0);
			} while((calcAgain != 'y') && (calcAgain != 'n'));
		} while(calcAgain != 'n');
	}
}