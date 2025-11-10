class Solution {
    public int solution(int[] num_list) {
        int resultMul = 1;
        int resultSS = 0;
        for (int n : num_list) {
            resultMul *= n;
            resultSS += n;
        }
        resultSS *= resultSS;
        if (resultMul < resultSS) {
            return 1;
        } else {
            return 0;
        }
    }
}
