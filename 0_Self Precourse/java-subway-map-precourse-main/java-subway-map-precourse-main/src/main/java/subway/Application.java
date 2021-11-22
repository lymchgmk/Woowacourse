package subway;

import java.util.Scanner;
import java.util.Arrays;

import subway.domain.Page;

public class Application {	
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        while (true) {
        	String userInput = scanner.next();
        	if (userInput == "Q") {
        		System.out.println("종료하겠습니다.");
        		scanner.close();
        		break;
        	}
        	
        	if (allowUserInput(userInput)) {
        		Page page = new Page(userInput, scanner);
        	}
        	else {
        		System.out.println("잘못된 userInput 입니다.");
        	}
        }
    }
    
	private static boolean allowUserInput(String userInput) {
		return Arrays.asList(Constants.ALLOWED_INPUT).contains(userInput);
	}
}
