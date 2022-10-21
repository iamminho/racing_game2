package controller;

import model.Car;
import model.Cars;
import view.ResultView;
import view.WinnerView;

public class Game {
	static Input input = new Input();
	static ResultView resultView = new ResultView();
	static Winner winner = new Winner();
	static WinnerView winnerView = new WinnerView();

	public static void playGame() {
		Cars cars = new Cars(input.getCarList());
		int trialNumber = input.getTrialNumber();

		playOneGame(cars, trialNumber);
	}

	static void playOneGame(Cars cars, int trialNumber) {
		resultView.printExcutionResult();
		for (int i = 0; i < trialNumber; i++) {
			getMoveCars(cars);
			resultView.gameResult(cars);
		}

		winnerView.printWinner(winner.getWinner(cars));
	}

	static void getMoveCars(Cars cars) {
		for (Car car : cars.getCarList()) {
			car.getMoveCar();
		}
	}

}
