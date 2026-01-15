import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return Integer.compare(arr1.length, arr2.length);
        }
        
        return compareSum(arr1, arr2);
    }
    
    private int compareSum(int[] arr1, int[] arr2) {
        return Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum());
    }
}