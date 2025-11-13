import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>(List.of(n));
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                answer.add(n);
            } else {
                n = 3 * n + 1;
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
