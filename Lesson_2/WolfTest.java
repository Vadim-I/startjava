public class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.name = "Seryj";
		myWolf.sex = "Man";
		myWolf.color = "Grey";
		myWolf.weight = 45;
		myWolf.age = 4.5f;

		System.out.println("Кличка волка - " + myWolf.name);
		System.out.println("Пол волка - " + myWolf.sex);
		System.out.println("Окрас волка - " + myWolf.color);
		System.out.println("Вес волка - " + myWolf.weight + " кг");
		System.out.println("Возраст волка - " + myWolf.age + " года");

		myWolf.move();
		myWolf.sit();
		System.out.println(myWolf.run());
		System.out.println(myWolf.howl());
		System.out.println(myWolf.hunt());
	}
}