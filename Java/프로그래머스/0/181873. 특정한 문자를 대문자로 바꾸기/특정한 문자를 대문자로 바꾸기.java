class Solution {
        public String solution(String my_string, String alp) {
            char[] alphabet = my_string.toCharArray();
            for (int i = 0; i < alphabet.length; i++) {
                if (alp.contains(String.valueOf(alphabet[i])) && (alphabet[i] >= 'a' && alphabet[i] <= 'z')) {
                    alphabet[i] = (char) (alphabet[i] - 32);
                }
            }
            return new String(alphabet);
        }
}