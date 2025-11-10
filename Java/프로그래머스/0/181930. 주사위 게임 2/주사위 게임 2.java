import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> numbers = new HashSet<>(List.of(a, b, c));
        if (numbers.size() == 3) {
            return multipleRules(a, b, c, 1);
        } else if (numbers.size() == 2) {
            return multipleRules(a, b, c, 2);
        } else {
            return multipleRules(a, b, c, 3);
        }
    }

    private int multipleRules(int a, int b, int c, int x) {
        if (x == 1) {
            return a + b + c;
        }
        int ret = multipleRules(a, b, c, x - 1);
        return ret * (int) (Math.pow(a, x) + Math.pow(b, x) + Math.pow(c, x));
    }
}
