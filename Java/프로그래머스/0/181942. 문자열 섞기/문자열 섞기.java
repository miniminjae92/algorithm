class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str1.length() || i < str2.length()) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
