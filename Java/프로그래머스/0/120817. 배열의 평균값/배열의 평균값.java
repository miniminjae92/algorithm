import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double sum = Arrays.stream(numbers)
            .mapToDouble(n -> n)
            .sum();
        return sum / numbers.length;
    }
}