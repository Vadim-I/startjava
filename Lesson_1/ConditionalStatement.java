public class ConditionalStatement {
	public static void main(String[] args) {
		
		int yourAge = 28;
		if (yourAge > 20) {
			System.out.println("Ваш возраст больше 20 лет");
		}

		boolean isMan = false;
		if (isMan == true) {
			System.out.println("Вы мужчина");
		}
		if (!isMan == true) {
			System.out.println("Вы не мужчина");
		}

		float yourHeight = 1.72f;
		if (yourHeight < 1.80f) {
			System.out.println("Ваш рост меньше 1 м 80 см");
		} else {
			System.out.println("Ваш рост не меньше 1 м 80 см");
		}

		char firstLetterOfName = 'M';
		if (firstLetterOfName == 'M') {
			System.out.println("Первая буква вашего имени - M");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Первая буква вашего имени - I");
		} else {
			System.out.println("Первая буква вашего имени - не M и не I");
		}

	}

}