class Solution {
    public int solution(int a, int b) {
        boolean isAOdd = (a & 1) != 0;
        boolean isBOdd = (b & 1) != 0;
        
        if (isAOdd && isBOdd) {
            return (a * a) + (b * b);
            
		}
        if (isAOdd || isBOdd) {
            return 2 * (a + b);
        }
        return Math.abs(a - b);
    }
}