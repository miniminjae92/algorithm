class Solution {
    public int solution(int a, int d, boolean[] included) {
        int n = included.length;
        int i = 0;
        int result = 0;
        while (i < n) {
            if (included[i]) {
                result += a;
            }
            a = a + d;
            i++;
        }
        return result;
    }
}
