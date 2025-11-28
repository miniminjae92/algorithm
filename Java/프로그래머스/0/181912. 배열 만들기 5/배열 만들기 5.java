import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for (String intStr : intStrs) {
            StringBuilder sb = new StringBuilder(intStr);
            int target = Integer.parseInt(sb.substring(s, s + l));
            if (target > k) {
                result.add(target);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
