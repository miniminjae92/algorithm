class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int resultNumer = numer1 * denom2 + numer2 * denom1;
    int resultDenom = denom1 * denom2;
    int gcd = getGCD(resultNumer, resultDenom);
    return new int[]{resultNumer / gcd, resultDenom / gcd};
    }
    private int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}