class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int i = 0;
        while (i < k) {
            answer[i++] = -1;
        }
        i = 0;
        for (int randomNumber : arr) {
        	boolean flag = false;
            for (int number : answer) {
                if (number == randomNumber) {
                    flag = true;
                    break;
                }
            }
            if (i < k && flag == false) {
                answer[i++] = randomNumber;
			}
        }
        return answer;
    }
}