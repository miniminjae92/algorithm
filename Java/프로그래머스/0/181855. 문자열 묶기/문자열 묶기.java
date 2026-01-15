import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        Map<Integer, Integer> countsByLength = new HashMap<>();
        for (String s : strArr) {
            countsByLength.put(s.length(), countsByLength.getOrDefault(s.length(), 0) + 1);
        }
        return countsByLength.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}