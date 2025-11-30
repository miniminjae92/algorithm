class Solution {
    public String solution(int q, int r, String code) {
        char[] arr = code.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}