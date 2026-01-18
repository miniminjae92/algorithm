class Solution {
    public String solution(int n) {
        StringBuilder buffer = new StringBuilder();
        while (n > 0) {
            buffer.append(n % 10);
            n = n / 10;
        }
        return buffer.reverse().toString();
    }
}