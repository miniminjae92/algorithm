import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] after = new int[num_list.length - n];
        int[] before = new int[n];
        
        after = Arrays.copyOfRange(num_list, n, num_list.length);
        before = Arrays.copyOfRange(num_list, 0, n);
        
        int[] answer = new int[num_list.length];
        
        int i = 0;
        for (int num : after) {
            answer[i++] = num;
            System.out.println(num);
        }
        for (int num : before) {
            answer[i++] = num;
        }
        
        return answer;
    }
}