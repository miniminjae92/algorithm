import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        if (size1 == size2) {
            int total1 = Arrays.stream(arr1).sum();
            int total2 = Arrays.stream(arr2).sum();
            if (total1 == total2) {
                return 0;
            }
            return total1 > total2 ? 1 : -1;
        }
        return size1 > size2 ? 1 : -1;
    }
}