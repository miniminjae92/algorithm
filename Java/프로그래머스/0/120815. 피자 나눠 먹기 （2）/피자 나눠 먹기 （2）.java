class Solution {
    public int solution(int n) {
        // gcd: gcd(a, b) = gcd(b, r)
        // lcm: a * b = gcd(a, b) * lcm(a, b)
        return ((6 / gcd(6, n)) * n) / 6;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}