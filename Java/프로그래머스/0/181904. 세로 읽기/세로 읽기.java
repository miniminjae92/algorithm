class Solution {
    public String solution(String my_string, int m, int c) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = c - 1; i < arr.length; i++) {
            if (i % m == c - 1) {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}