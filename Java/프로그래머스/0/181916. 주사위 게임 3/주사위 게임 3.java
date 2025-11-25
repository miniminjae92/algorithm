import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(List.of(a, b, c, d));
        for (Integer i : list) {
            map.compute(i, (k, v) -> v == null ? 1 : v + 1);
        }
        if (map.size() == 4) {
          return map.entrySet().stream().map(entry -> entry.getKey()).min(Integer::compareTo).get();
        } else if (map.size() == 3) {
            int ans = 1;
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    ans *= entry.getKey();
                }
            }
            return ans;
        } else if (map.size() == 2) {
            if (map.values().stream().anyMatch(v -> v != 2)) {
                int q = map.entrySet().stream().filter(entry -> entry.getValue() == 1).findAny().get().getKey();
                int r = map.entrySet().stream().filter(entry -> entry.getValue() == 3).findAny().get().getKey();
                return (10 * r + q) * (10 * r + q);
            } else {
                Iterator<Integer> it = map.keySet().iterator();
                int q = it.next();
                int r = it.next();
                return (q + r) * Math.abs(q - r);
            }
        } else {
           return 1111 * map.keySet().iterator().next();
        }
    }
}
