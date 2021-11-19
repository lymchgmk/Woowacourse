package racingcar;

public class Racing {
	public void start() {
		System.out.println(Constants.GAME_START_MSG);
		do {
			pass
		} while (true in cars.canRun)
		
		String gameEndingMsg = Constants.GAME_WINNERS;
		for (Car car : cars) {
			if (car.win) {
				gameEndingMsg += car.name;
			}
		}
		System.out.println(gameEndingMsg);
	}
}
