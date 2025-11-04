class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int lenStart = my_string.length();
        String answer = my_string.substring(0, s);
        answer += overwrite_string;
        s += overwrite_string.length();
        if (s < lenStart) {
            answer += my_string.substring(s);
        }
        return answer;
    }
}