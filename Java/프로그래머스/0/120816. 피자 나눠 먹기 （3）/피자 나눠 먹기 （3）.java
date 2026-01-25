class Solution {
    public int solution(int slice, int n) {
        int x = 1;
        while (slice * x < n) {
            x++;
        }
        return x;
    }
}