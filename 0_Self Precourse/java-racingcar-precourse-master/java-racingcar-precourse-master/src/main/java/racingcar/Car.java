package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;
    private boolean canRun = true;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    protected void go(Car car) {
    	int zeroToNine = RandomUtils.nextInt(0, 9);
    	if (zeroToNine >= 4 && canRun) {
    		position++;
    	}
    	else {
    		canRun = false;
    	}
    }
}
