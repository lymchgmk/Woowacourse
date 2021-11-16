package baseball;

import java.util.Scanner;

import utils.RandomUtils;

public class BaseballGame {
	private Scanner scanner;
	private int[] answer = Constants.DEFAULT_ANSWER;
	private int strikes = 0;
	private int balls = 0;
	private boolean isContinue = true;
	
    public BaseballGame(Scanner scanner) {
    	this.scanner = scanner;
    }
    
    private int[] generateAnswer() {
    	int[] answer = Constants.DEFAULT_ANSWER;
    	boolean[] usedNumbers = new boolean[Constants.MAX_DIGIT_VALUE + 1];
    	for (int i=0; i<3; i++) {
    		int number = RandomUtils.nextInt(Constants.MIN_DIGIT_VALUE, Constants.MAX_DIGIT_VALUE);
    		
    		if (!usedNumbers[number]) {
    			usedNumbers[number] = true;
    			answer[i] = number;
    		} else {
    			i--;
    		}
    	}
    	return answer;
    }
    
    private boolean continueOrStop() {
    	
    }
    
    private int countStrikes() {
    	
    }
    
    private int countBalls() {
    	
    }
    
    public void start() {
    	// 첫 시작
    	System.out.println(Constants.GAME_START_MSG);
    	this.answer = generateAnswer();
    	
    	// 숫자입력
    	do {
	    	System.out.print(Constants.INPUT_NUM_MSG);
	    	int userAnswer = scanner.nextInt();
	    	
	    	int userStrikes = 0;
	    	int userBalls = 0;
	    	// 현재 맞춘 정보 출력
	    	String currAnswerMessage = "";
	    	if (userStrikes != 0) {
	    		currAnswerMessage += Integer.toString(userStrikes) + "스트라이크";
	    	}
	    	if (currAnswerMessage != "") {
	    		currAnswerMessage += " ";
	    	}
	    	if (userBalls != 0) {
	    		currAnswerMessage += Integer.toString(userBalls) + "볼";
	    	}
	    	System.out.println(currAnswerMessage);
	    	
	    	if (userStrikes == 3) {
	    		System.out.println(Constants.GAME_END_MSG);
	    		System.out.println(Constants.GAME_CONTINUE_MSG);
	    		int isContinue = scanner.nextInt();
	    	}
	    	boolean isContinue = continueOrStop();
    	} while (isContinue);
    	
    	// 답 맞춘 후 출력
    	System.out.println(Constants.GAME_END_MSG);
    	
    	// 계속 할지 입력 1이면 계속 2면 중지
    	restart(scanner.nextInt());
    }
    
    private void restart(int nextInt) {
		// TODO Auto-generated method stub
		
	}
}