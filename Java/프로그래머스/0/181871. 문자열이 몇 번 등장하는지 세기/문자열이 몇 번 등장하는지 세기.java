class Solution {
        public int solution(String myString, String pat) {
            int count = 0;
            while (myString.contains(pat)) {
                myString = myString.substring(myString.indexOf(pat) + 1);
                count++;
            }
            return count;
        }

}