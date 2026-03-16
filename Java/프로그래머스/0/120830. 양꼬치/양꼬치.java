class Solution {
    public int solution(int n, int k) {
        int r = n / 10;
        return (n * 12000) + (k * 2000) - (r * 2000);
    }
}