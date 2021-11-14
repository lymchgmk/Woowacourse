package.number;

import utils.RandomUtils;

import java.util.List;
import java.util.ArrayList;

public class GenerateAnswer {
    public static void main() {
        List<Integer> answer = new ArrayList<Integer>();
        int randomNumber;
        for (int i=0; i<3; i++) {
            randomNumber = RandomUtils.nextInt(1, 9);
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
                continue;
            }
            i--;
        }
        return answer;
    }
}
