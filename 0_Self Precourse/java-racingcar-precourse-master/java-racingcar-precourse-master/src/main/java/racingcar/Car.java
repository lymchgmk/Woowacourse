package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    
    public String name() {
    	return this.name;
    }
    
    public int position() {
    	return this.position;
    }
    
    private String raceResultMsg() {
    	String raceResult = this.name + " : ";
    	for (int i=0; i<this.position; i++) {
    		raceResult += "-";
    	}
    	return raceResult;
    }

    // 추가 기능 구현
    public void raceOrStop() {
    	int zeroToNine = RandomUtils.nextInt(0, 9);
    	if (zeroToNine >= 4) {
    		position++;
    	}
    	
    	System.out.println(raceResultMsg());
    }
}
