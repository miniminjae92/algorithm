class Solution {
    public String solution(String a, String b) {
        StringBuilder buffer = new StringBuilder();
        int lastIndexOfA = a.length() - 1;
        int lastIndexOfB = b.length() - 1;
        int carry = 0;
        
        while (lastIndexOfA >= 0 || lastIndexOfB >= 0 || carry > 0) {
            int sum = 0;
            sum = carry;
            if (lastIndexOfA >= 0) {
                sum += a.charAt(lastIndexOfA--) - '0';
            }
            if (lastIndexOfB >= 0) {
                sum += b.charAt(lastIndexOfB--) - '0';
            }
            buffer.append(sum % 10);
            carry = sum / 10;
        }
        return buffer.reverse().toString();
    }
}