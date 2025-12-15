class Solution {
    public String[] solution(String[] names) {
        int arrSize = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        String[][] result = new String[arrSize][5];

        for (int i = 0; i < names.length; i++) {
            result[i / 5][i % 5] = names[i];
        }

        String[] answer = new String[result.length];

        int index = 0;
        for (String[] row : result) {
            answer[index++] = row[0];
        }

        return answer;
    }
}
