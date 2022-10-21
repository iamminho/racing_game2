package model;

public class Car {
	private static final int RANDOM_MIN_NUMBER = 0;
	private static final int RANDOM_MAX_NUMBER = 9;
	private static final int STANDARD_NUMBER = 4;
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void getMoveCar() {
		if (getRandomNumber()) {
			this.position += 1;
		}
	}

	public static boolean getRandomNumber() {
		int randomNum = (int)(Math.random() * RANDOM_MAX_NUMBER + 1) + RANDOM_MIN_NUMBER;
		if (randomNum >= STANDARD_NUMBER) {
			return true;
		}
		return false;
	}

}
