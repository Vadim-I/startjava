public class MyFirstGame {
	public static void main(String[] args) {
		int playerNum = 83;
		int pcNum = 88;

		if (playerNum > pcNum) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (playerNum < pcNum) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
		}
	}	
}