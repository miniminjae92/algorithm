class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int tempSize = 0;
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                size += arr[i] * 2;
                tempSize += arr[i] * 2;
            } else {
                size -= arr[i];
            }
        }
        answer = new int[tempSize];
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                count = arr[i] * 2;
                while (count-- > 0) {
                    answer[index++] = arr[i];
                }
            } else {
                count = arr[i];
                while (count-- > 0) {
                    index--;
                }
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = answer[i];
        }
        return result;
    }
}