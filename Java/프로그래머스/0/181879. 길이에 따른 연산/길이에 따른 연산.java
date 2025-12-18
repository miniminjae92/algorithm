class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        if (num_list.length >= 11) {
            for (int n : num_list) {
                result += n;
            }
        } else {
            result = 1;
            for (int n : num_list) {
                result *= n;
            }
        } 
        return result;
    }
}
