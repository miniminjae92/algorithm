import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : numbers) {
            pq.offer(num);
        }
        return pq.poll() * pq.poll();
    }
}