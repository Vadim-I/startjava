public class MyFirstGame {
	public static void main(String[] args) {
		
	int numbInput = 83, numbPc = 83;

	do {
		if (numbInput > numbPc) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (numbInput < numbPc) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} 
	} while(numbInput != numbPc);
	System.out.println("Вы угадали!");
	}	
}