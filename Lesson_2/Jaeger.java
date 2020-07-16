public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private String status;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String x1, String x2, String x3, String x4, float x5, float x6, int x7, int x8, int x9) {
		modelName = x1;
		mark = x2;
		origin = x3;
		status = x4;
		height = x5;
		weight = x6;
		speed = x7;
		strength = x8;
		armor = x9;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public String getStatus() {
		return status;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public void move() {
		System.out.println("Jaeger прошел 10 шагов");
	}

	public void attack() {
		System.out.println("Jaeger атакует Kaiju");
	}

	public String scanKaiju() {
		System.out.println("Jaeger ищет Kaiju");
		return "result: nothing";
	}
}