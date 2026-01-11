class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        char[] answer = myString.toCharArray();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 'a') {
                answer[i] = 'A';
            }
        }
        return String.valueOf(answer);
    }
}