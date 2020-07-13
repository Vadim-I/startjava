public class Wolf {
	String name;
	String sex;
	String color;
	int weight;
	float age;

	void move() {
		System.out.println("Волк может ходить");
	}

	void sit() {
		System.out.println("Волк может сидеть в засаде");
	}

	boolean run() {
		System.out.println("Волк быстро бегает");
		return true;
	}

	boolean howl() {
		System.out.println("Волк часто воет");
		return false;
	}

	String hunt() {
		System.out.println("Волк умеет охотиться");
		return "основная добыча - зайцы";
	}
}