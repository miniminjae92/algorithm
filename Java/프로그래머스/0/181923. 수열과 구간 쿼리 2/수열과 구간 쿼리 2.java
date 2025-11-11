import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int minValue = query[2];
            int[] candidates = new int[end - start + 1];
            for (int i = 0; i <= end - start; i++) {
                candidates[i] = arr[start + i];
            }
            answer.add(Arrays.stream(candidates).filter(n -> n > minValue).min().orElse(-1));
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

