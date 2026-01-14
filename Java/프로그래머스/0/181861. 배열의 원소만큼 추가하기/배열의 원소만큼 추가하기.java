class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int x : arr) {
            size += x;
        }
        int[] answer = new int[size];
        int value = 0;
        int idx = 0;
        for (int x : arr) {
            value = x;
            while (x-- > 0) {
                answer[idx++] = value;
            }
        }
        return answer;
    }
}