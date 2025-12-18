class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        while (true) {
            int[] pre = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (isEqaul(pre, arr)) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    private boolean isEqaul(int[] ori, int[] other) {
        int size = ori.length;
        for (int i = 0; i < size; i++) {
            if (ori[i] != other[i]) {
                return false;
            }
        }
        return true;
    }
}
