import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                continue;
            }
            if (stk.get(stk.size() - 1).equals(arr[i])) {
                stk.remove(stk.size() - 1);
                continue;
            } 
            stk.add(arr[i]);
        }
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}