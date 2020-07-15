public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jCrimsonTyphoon = new Jaeger();
		jCrimsonTyphoon.setModelName("Crimson Typhoon");
		jCrimsonTyphoon.setMark("Mark-4");
		jCrimsonTyphoon.setOrigin("China");
		jCrimsonTyphoon.setStatus("Destroyed");
		jCrimsonTyphoon.setHeight(76.2f);
		jCrimsonTyphoon.setWeight(1.722f);
		jCrimsonTyphoon.setSpeed(9);
		jCrimsonTyphoon.setStrength(8);
		jCrimsonTyphoon.setArmor(6);
		
		Jaeger jStrikerEureka = new Jaeger();
		jStrikerEureka.setModelName("Striker Eureka");
		jStrikerEureka.setMark("Mark-5");
		jStrikerEureka.setOrigin("Australia");
		jStrikerEureka.setStatus("Destroyed");
		jStrikerEureka.setHeight(76.2f);
		jStrikerEureka.setWeight(1.850f);
		jStrikerEureka.setSpeed(10);
		jStrikerEureka.setStrength(10);
		jStrikerEureka.setArmor(9);

		System.out.println("modelName 1 = " + jCrimsonTyphoon.getModelName());
		System.out.println("status of " + jCrimsonTyphoon.getModelName() + " is " + jCrimsonTyphoon.getStatus());
		System.out.println("speed = " + jCrimsonTyphoon.getSpeed());
		System.out.println("strength = " + jCrimsonTyphoon.getStrength());
		System.out.println("modelName 2 = " + jStrikerEureka.getModelName());
		System.out.println("status of " + jStrikerEureka.getModelName() + " is " + jStrikerEureka.getStatus());
		System.out.println("speed = " + jStrikerEureka.getSpeed());
		System.out.println("strength = " + jStrikerEureka.getStrength());
		jCrimsonTyphoon.move();
		jCrimsonTyphoon.attack();
		System.out.println(jStrikerEureka.scanKaiju());
	}
}