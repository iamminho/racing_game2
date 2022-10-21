package controller;

import java.util.HashSet;
import java.util.Set;

public class CarNames {
	private static final String LIMIT_CARNAME_LENGTH = "[ERROR] 차 이름의 길이는 1글자 이상 5글자 이하로 가능합니다.";
	private static final String LIMIT_CARNAME_DUPLICATION = "[ERROR] 중복된 차이름은 불가능 합니다.";
	private static final String LIMIT_CARNAME_LASTCOMMA = "[ERROR] 쉼표로 끝나는 이름은 불가능 합니다.";
	private final String[] carNames;

	public CarNames(String carName) {
		String[] carNames = carName.split(",");
		validSize(carNames);
		validDuplcation(carNames);
		validLastComma(carName);
		this.carNames = carNames;
	}

	private void validSize(String[] carNames) {
		for (String carName : carNames) {
			if (carName.length() > 5 || carName.length() < 1) {
				throw new IllegalArgumentException(LIMIT_CARNAME_LENGTH);
			}
		}
	}

	private void validDuplcation(String[] carNames) {
		Set<String> set = new HashSet<>();
		for (String carName : carNames) {
			set.add(carName);
		}

		if (set.size() != carNames.length) {
			throw new IllegalArgumentException(LIMIT_CARNAME_DUPLICATION);
		}
	}

	private void validLastComma(String carName) {
		if (carName.charAt(carName.length() - 1) == ',') {
			throw new IllegalArgumentException(LIMIT_CARNAME_LASTCOMMA);
		}
	}

	public String[] getCarNames() {
		return carNames;
	}
}
