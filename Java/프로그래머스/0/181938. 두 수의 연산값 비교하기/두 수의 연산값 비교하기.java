class Solution {
    public int solution(int a, int b) {
        int addResult = Integer.parseInt(String.join("", String.valueOf(a), String.valueOf(b)));
        int multipleResult = 2 * a * b;
        return Math.max(addResult, multipleResult);
    }
}
