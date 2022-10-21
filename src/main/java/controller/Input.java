package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Car;

public class Input {
	private List<Car> carList = new ArrayList<>();
	private static final String INPUT_CARNAME_MENTION = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분";
	private static final String INPUT_TRIALNUMBER_MENTION = "시도할 횟수는 몇회인가요?";
	static Scanner sc = new Scanner(System.in);

	static String getInputCarName() {
		System.out.println(INPUT_CARNAME_MENTION);
		return sc.nextLine();
	}

	static String[] getInputCarNameArray() {
		while (true) {
			try {
				CarNames carNames = new CarNames(getInputCarName());
				return carNames.getCarNames();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void setCarList() {
		String[] carNameArray = getInputCarNameArray();
		for (String carName : carNameArray) {
			Car car = new Car(carName);
			carList.add(car);
		}
	}

	public List<Car> getCarList() {
		setCarList();
		return carList;
	}

	static String getInputTrialNumber() {
		System.out.println(INPUT_TRIALNUMBER_MENTION);
		return sc.nextLine();
	}

	public static int getTrialNumber() {
		while (true) {
			try {
				TrialNumber trialNumber = new TrialNumber(getInputTrialNumber());
				return trialNumber.getTrialNumber();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
