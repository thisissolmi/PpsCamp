import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A004 {
    public List<Integer> solution(List<Integer> arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }

        Collections.sort(answer);

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }
}
