package baseball;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

import utils.RandomUtils;

public class BaseBallGame {
	private Scanner scanner;
	private int[] answer;
	private int isContinue;
	
	// 생성자로 초기화
    public BaseBallGame(Scanner scanner) {
    	this.scanner = scanner;
    	this.answer = Constants.DEFAULT_ANSWER;
    	this.isContinue = 0;
    }
    
    private void generateAnswer() {
    	boolean[] usedNumbers = new boolean[Constants.MAX_DIGIT_VALUE + 1];
    	for (int i=0; i<3; i++) {
    		int number = RandomUtils.nextInt(Constants.MIN_DIGIT_VALUE, Constants.MAX_DIGIT_VALUE);
    		if (!usedNumbers[number]) {
    			usedNumbers[number] = true;
    			this.answer[i] = number;
    		} else {
    			i--;
    		}
    	}
    }
    
    private int countStrikes(int[] userInput) {
    	int strikes = 0;
    	for (int i=0; i<3; i++) {
    		if(userInput[i] == answer[i]) {
    			strikes++;
    		}
    	}
    	return strikes;
    }
    
    private int countBalls(int[] userInput) {
    	int balls = 0;
    	for (int i=0; i<3; i++) {
    		int userInputDigit = userInput[i];
    		if (userInputDigit != answer[i] && Arrays.stream(answer).anyMatch(x -> x == userInputDigit)) {
    			balls++;
    		}
    	}
    	return balls;
    }
    
    private String currCountMessage(int strikes, int balls) {
    	String message = "";
    	if (strikes != 0) {
    		message += Integer.toString(strikes) + "스트라이크";
    	}
    	if (message != "") {
    		message += " ";
    	}
    	if (balls != 0) {
    		message += Integer.toString(balls) + "볼";
    	}
    	return message;
    }
    
    public void start() {
    	// 첫 시작
    	System.out.println(Constants.GAME_START_MSG);
    	generateAnswer();
    	
    	// 숫자입력
    	do {
	    	System.out.print(Constants.INPUT_NUM_MSG);
	    	int[] userInput = Stream.of(String.valueOf(scanner.nextInt()).split("")).mapToInt(Integer::parseInt).toArray();
	    	// 스트라이크 볼 판단
	    	int userStrikes = countStrikes(userInput);
	    	int userBalls = countBalls(userInput);
	    	
	    	// 현재 맞춘 정보 출력
	    	System.out.println(currCountMessage(userStrikes, userBalls));
	    	
	    	// 답 맞춘 경우 출력
	    	if (userStrikes == 3) {
	    		System.out.println(Constants.GAME_END_MSG);
	    		// 계속 할지?
	    		System.out.println(Constants.GAME_CONTINUE_MSG);
	    		this.isContinue = scanner.nextInt();
	    	}
    	} while (this.isContinue == 0);
    	
    	if (this.isContinue == 1) {
    		this.isContinue = 0;
    		start();
    	}
    	else if (this.isContinue == 2) {
    		System.out.println(Constants.GAME_EXIT_MSG);
    	}
    }
}