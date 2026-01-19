class Solution {
    public String solution(String myString) {
        StringBuilder buffer = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                buffer.append('l');
                continue;
            }
            buffer.append(c);
		}
        return buffer.toString();
    }
}