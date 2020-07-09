public class Cycle {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {				// Выведите на консоль с помощью цикла for все числа от [0, 20]
			System.out.print(i + " ");
		}
		System.out.print("\r\n");

		int j = 6;									// Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		while(j >= -6) {
			System.out.print(j + " ");
			j -= 2;
		}
		System.out.print("\r\n");

		int sum = 0;								// Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль	
		int k = 10;
		do {
			if (k % 2 != 0) {
				sum = sum + k;
			}
			k++;
		} while (k <= 20);
		System.out.print(sum + "\r\n");
	}
}