import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] sorted = Arrays.stream(num_list).sorted().toArray();
        return Arrays.copyOfRange(sorted, 5, sorted.length);
    }
}