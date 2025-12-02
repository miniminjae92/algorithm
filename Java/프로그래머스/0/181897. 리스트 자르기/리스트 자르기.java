class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int idx = 0;

        if (n == 1) {
            int[] answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
               answer[idx++] = num_list[i];
            }
            return answer;
        } else if (n == 2) {
            int[] answer = new int[num_list.length - a];
            for (int i = a; i < num_list.length; i++) {
                answer[idx++] = num_list[i];
            }
            return answer;
        } else if (n == 3) {
            int[] answer = new int[b - a + 1];
            for (int i = a; i <= b; i++) {
                answer[idx++] = num_list[i];
            }
            return answer;
        } else {
            int[] answer = new int[(int) Math.ceil((double) (b - a + 1) / c)];
            for (int i = a; i <= b; i += c) {
                answer[idx++] = num_list[i];
            }
            return answer;
        }
    }
}
