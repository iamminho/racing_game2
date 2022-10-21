package controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Car;
import model.Cars;

public class Winner {
	public List<Car> getWinner(Cars cars) {
		int maxPosition = getMaxPosition(cars);
		return cars.getCarList().stream()
			.filter(car -> car.getPosition() == maxPosition)
			.collect(Collectors.toList());
	}

	public int getMaxPosition(Cars cars) {
		Car maxValueCar = cars.getCarList().stream()
			.max(Comparator.comparing(car -> car.getPosition())).get();

		return maxValueCar.getPosition();
	}
}
