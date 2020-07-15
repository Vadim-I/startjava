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

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	public float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	void setArmor(int armor) {
		this.armor = armor;
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