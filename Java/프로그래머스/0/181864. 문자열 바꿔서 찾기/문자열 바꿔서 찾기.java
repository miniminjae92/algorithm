class Solution {
        public int solution(String myString, String pat) {
            char[] charArray = myString.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'A') {
                    charArray[i] = 'B';
                    continue;
                }
                if (charArray[i] == 'B') {
                    charArray[i] = 'A';
                }
            }
            if (String.valueOf(charArray).contains(pat)) {
                return 1;
            }
            return 0;
        }

}