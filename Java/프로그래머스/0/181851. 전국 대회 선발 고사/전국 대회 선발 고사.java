import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankToNumber = new TreeMap<>();
        for (int i = 0; i < rank.length; i ++) {
            if (!attendance[i]) {
                continue;
            }
            rankToNumber.put(rank[i], i);
        }
        List<Integer> result = rankToNumber.entrySet().stream().limit(3).map(e -> e.getValue()).collect(Collectors.toList());
        return (10000 * result.get(0)) + (100 * result.get(1)) + result.get(2);
    }
}