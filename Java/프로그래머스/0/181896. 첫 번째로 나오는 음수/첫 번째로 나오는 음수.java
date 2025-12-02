class Solution {
    public int solution(int[] num_list) {
        int i = 0;
        for (int n : num_list) {
            if (n < 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
