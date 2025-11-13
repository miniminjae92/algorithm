import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String numbers = String.valueOf(i);
            boolean flag = true;
            for (char n : numbers.toCharArray()) {
                if (n != '5' && n != '0') {
                    flag = false;
                }
            }
            if (flag) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
