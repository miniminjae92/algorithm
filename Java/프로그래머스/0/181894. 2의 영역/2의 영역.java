import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int findFirstIndex = -1;
        int findLastIndex = -1;
        int i = 0;

        for (int n : arr) {
            if (findFirstIndex < 0 && n == 2) {
                findFirstIndex = i;
            } else if (n == 2) {
                findLastIndex = i;
            }
            i++;
        }
        if (findFirstIndex < 0) {
            return new int[]{-1};
        } else if (findLastIndex < 0) {
            return new int[]{2};
        }
        return Arrays.copyOfRange(arr, findFirstIndex, findLastIndex + 1);
    }
}
