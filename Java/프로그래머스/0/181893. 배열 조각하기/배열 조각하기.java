import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int queryIdx = 0; queryIdx < query.length; queryIdx++) {
            int targetIdx = query[queryIdx];
            if (queryIdx % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, targetIdx + 1);
            } else {
                arr = Arrays.copyOfRange(arr, targetIdx, arr.length);
            }
        }
        return arr;
    }
}
