class Solution {
    public int solution(int a, int b) {
        String ab = String.join("", String.valueOf(a), String.valueOf(b));
        String ba = String.join("", String.valueOf(b), String.valueOf(a));
        if (Integer.parseInt(ab) < Integer.parseInt(ba)) {
            return Integer.parseInt(ba);
        }
        return Integer.parseInt(ab);
    }
}
