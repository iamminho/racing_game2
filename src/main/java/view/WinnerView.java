package view;

import java.util.List;

import model.Car;

public class WinnerView {
	private static final String FINAL_WINNER = "최종 우승자 : ";

	public static void printWinner(List<Car> carList) {
		System.out.print(FINAL_WINNER);
		for (int i = 0; i < carList.size(); i++) {
			System.out.print(carList.get(i).getName());
			if (i != carList.size() - 1) {
				System.out.print(", ");
			}
		}
	}
}
