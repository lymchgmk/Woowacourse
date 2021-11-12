import Constant;


public class BaseballGame {
    public static int[] target = new int[3];
    public static int strike = 0;
    public static int ball = 0;

    public void generateRandomNumber() {
        // 어디에 언제 저장할지 생각해볼것

    }

    public void playBall() {
        // 사용자의 답을 읽는 메소드
        
    }

    public void judgeBallOrStrike() {
        // 사용자의 답과 target을 비교하는 메소드
    }

    public void continueGame() {
        // 게임을 계속 할지 판단하는 메소드
            // 단 judgeBallOrStrike의 리턴값에 의존
    }

}
