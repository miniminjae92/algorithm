class Solution {
    public String solution(String my_string) {
        char[] answer = new char[my_string.length()];
        char[] my_chars = my_string.toCharArray();
        for (int i = 0; i < my_chars.length; i++) {
            answer[i] = my_chars[my_chars.length - 1 - i];
        }
        return String.valueOf(answer);

    }
}