package controller;

public class TrialNumber {
	private static final String VALID_ONLY_NUMBER = "[ERROR] 숫자 입력만 가능합니다.";
	private static final String VALID_OVER_ZERO = "[ERROR] 0이외의 0으로 시작하는 숫자는 입력이 불가능 합니다.";
	private final int trialNumber;

	public TrialNumber(String trialNumber) {
		isNumber(trialNumber);
		isStartNumberZero(trialNumber);
		this.trialNumber = Integer.parseInt(trialNumber);
	}

	private void isNumber(String trialNumber) {
		String regExp = "^[0-9]+$";
		if (!trialNumber.matches(regExp)) {
			throw new IllegalArgumentException(VALID_ONLY_NUMBER);
		}
	}

	private void isStartNumberZero(String trialNumber) {
		if (trialNumber.charAt(0) == '0' && trialNumber.length() > 1) {
			throw new IllegalArgumentException(VALID_OVER_ZERO);
		}
	}

	public int getTrialNumber() {
		return trialNumber;
	}
}
