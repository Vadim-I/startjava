public class GuessNumber {

	private int pcNum;
	private int playerNum;
			
	public int getPcNum() {
		return pcNum;
	}

	void setPcNum(int pcNum) {
		this.pcNum = pcNum;
	}

	public int getPlayerNum() {
		return playerNum;
	}

	void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	public void play () {
		if (playerNum > pcNum) {
			System.out.println("Введенное число больше того, что загадал компьютер. Переход хода.");
		} else if (playerNum < pcNum) {
			System.out.println("Введенное число меньше того, что загадал компьютер. Переход хода.");
		} else {
			System.out.println("Число угадано!");
		} 
	}
}