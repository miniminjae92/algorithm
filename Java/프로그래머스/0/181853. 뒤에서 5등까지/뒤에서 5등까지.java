import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] num_list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : num_list) {
            pq.add(num);
            if (pq.size() > 5) {
                pq.poll();
            }
        }
        
        return pq.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}