import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> answer = new HashMap<>();
        for (int n : array) {
        	answer.put(n, answer.getOrDefault(n, 0) + 1);
		}
        int maxValue = -1;
        int maxKey = -1;
        boolean isDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : answer.entrySet()) {
            int current = entry.getValue();
            if (current > maxValue) {
                maxValue = current;
                maxKey = entry.getKey();
                isDuplicate = false;
			}
            else if (current == maxValue) {
                isDuplicate = true;
            }
        }
        return isDuplicate ? -1 : maxKey;
    }
}