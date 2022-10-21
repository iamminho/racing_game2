package view;

import model.Car;
import model.Cars;

public class ResultView {
	private static final String EXECUTION_RESULT = "실행결과";

	public void printExcutionResult() {
		System.out.println("");
		System.out.println(EXECUTION_RESULT);
	}

	public static void gameResult(Cars cars) {
		for (Car car : cars.getCarList()) {
			printCarName(car);
			printCarPosition(car);
		}
		System.out.println("");
	}

	static void printCarName(Car car) {
		System.out.print(car.getName() + " : ");
	}

	static void printCarPosition(Car car) {
		for (int i = 0; i < car.getPosition(); i++) {
			System.out.print('-');
		}
		System.out.println("");
	}
}
