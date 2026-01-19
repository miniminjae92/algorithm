class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int round = 0;
        int number = 1;
        while (round < n / 2) {
            int row = round;
            int col = round;
            while (col < n - 1 - round) {
                answer[row][col++] = number++;
            }
            while (row < n - 1 - round) {
                answer[row++][col] = number++;
            }
            while (col > round) {
                answer[row][col--] = number++;
            }
            while (row > round) {
                answer[row--][col] = number++;
            }
            round++;
		}
        if (n % 2 != 0) {
            answer[n / 2][n / 2] = number;
        }
        return answer;
    }
}