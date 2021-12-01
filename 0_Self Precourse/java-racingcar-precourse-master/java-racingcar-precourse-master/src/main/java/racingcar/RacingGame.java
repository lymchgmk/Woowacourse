package racingcar;

import java.util.Scanner;
import java.util.ArrayList;

public class RacingGame {

	public RacingGame(Scanner scanner) {
	}
	
	private String[] splitCarNames(String userInput) {
		String[] carNames = userInput.split(",");
		for (int i=0; i<carNames.length; i++) {
			carNames[i] = carNames[i].trim();
		}
		return carNames;
	}
	
	private void race(Car[] cars, int playCnt) {
		for (int cnt=0; cnt<playCnt; cnt++) {
			for (Car car : cars) {
				car.raceOrStop();
			}
			System.out.println();
		}
	}

	private String finalWinnerMsg(Car[] cars) {
		ArrayList<String> finalWinners = new ArrayList<String>();
		
		int maxPosition = 0;
		for (Car car : cars) {
			if (maxPosition < car.getPosition()) {
				maxPosition = car.getPosition();
			}
		}
		
		for (Car car : cars) {
			if (car.getPosition() == maxPosition) {
				finalWinners.add(car.getName());
			}
		}
		
		return Constants.GAME_WINNERS_MSG + String.join(", ", finalWinners);
	}
	
	public void start() {
		System.out.println(Constants.INPUT_CAR_NAMES_MSG);
		Scanner scanner = new Scanner(System.in);
		String carNamesStr = scanner.nextLine().toString();
		String[] carNames = splitCarNames(carNamesStr);
		Car[] cars = new Car[carNames.length];
		for (int i=0; i<carNames.length; i++) {
			cars[i] = new Car(carNames[i]);
		}
		
		System.out.println(Constants.INPUT_PLAY_CNT_MSG);
		int playCnt = scanner.nextInt();
		scanner.close();
		System.out.println();
		
		race(cars, playCnt);
		
		System.out.println(finalWinnerMsg(cars));
	}
}
