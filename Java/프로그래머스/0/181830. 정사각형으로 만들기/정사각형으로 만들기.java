import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int size = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] answer = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Arrays.copyOf(arr[i], size);
        }
        return answer;
    }
}