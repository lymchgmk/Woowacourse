import Constant;


public class BaseballGame {
    public int[] answer = new int[3];
    public static int strike = 0;
    public static int ball = 0;

    public BaseballGame(int[] threeRandomNumbers) {
        this.answer = threeRandomNumbers;
    }

    public void generateRandomNumber() {
        // 어디에 언제 저장할지 생각해볼것

    }

    public void playBall() {
        // 사용자의 답을 읽는 메소드
        
    }

    public void judgeBallOrStrike(int[] args) {
        // 사용자의 답과 target을 비교하는 메소드
    }

    public void continueGame(int isContinue) {
        // 게임을 계속 할지 판단하는 메소드
            // 단 judgeBallOrStrike의 리턴값에 의존
    }

    public static void main(String args) {
        int[] threeRandonNumbers = generateRandomNumber();
        int[] strikeOrBall = int[3];
        BaseballGame baseballgame = new BaseballGame(threeRandomNumbers);
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            if judgeBallOrStrike(answer, scanner) == "Ball" {
                balls += 1;
            }
            else if judgeBallOrStrike(answer, scanner) == "Strike" {
                strikes += 1;
            }
        }

        if strikes == 3 {
            return Constant
        }
        else {
            coninue
        }





    }

}
