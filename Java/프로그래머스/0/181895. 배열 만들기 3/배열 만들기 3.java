import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];
            int[] sub = Arrays.copyOfRange(arr, a, b + 1);
            for (int n : sub) {
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
