public class JaegerTest {
	public static void main(String[] args) {
		Jaeger crimsonTyphoon = new Jaeger();
		crimsonTyphoon.setModelName("Crimson Typhoon");
		crimsonTyphoon.setMark("Mark-4");
		crimsonTyphoon.setOrigin("China");
		crimsonTyphoon.setStatus("Destroyed");
		crimsonTyphoon.setHeight(76.2f);
		crimsonTyphoon.setWeight(1.722f);
		crimsonTyphoon.setSpeed(9);
		crimsonTyphoon.setStrength(8);
		crimsonTyphoon.setArmor(6);
		
		Jaeger strikerEureka = new Jaeger();
		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("Mark-5");
		strikerEureka.setOrigin("Australia");
		strikerEureka.setStatus("Destroyed");
		strikerEureka.setHeight(76.2f);
		strikerEureka.setWeight(1.850f);
		strikerEureka.setSpeed(10);
		strikerEureka.setStrength(10);
		strikerEureka.setArmor(9);

		System.out.println("modelName 1 = " + crimsonTyphoon.getModelName());
		System.out.println("status of " + crimsonTyphoon.getModelName() + " is " + crimsonTyphoon.getStatus());
		System.out.println("speed = " + crimsonTyphoon.getSpeed());
		System.out.println("strength = " + crimsonTyphoon.getStrength());
		System.out.println("modelName 2 = " + strikerEureka.getModelName());
		System.out.println("status of " + strikerEureka.getModelName() + " is " + strikerEureka.getStatus());
		System.out.println("speed = " + strikerEureka.getSpeed());
		System.out.println("strength = " + strikerEureka.getStrength());
		crimsonTyphoon.move();
		crimsonTyphoon.attack();
		System.out.println(strikerEureka.scanKaiju());
	}
}