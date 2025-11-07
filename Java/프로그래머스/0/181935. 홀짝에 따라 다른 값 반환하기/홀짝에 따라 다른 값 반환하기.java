import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        if (n % 2 == 0) {
            return IntStream.iterate(n, i -> i - 1).limit(n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
        } else {
            return IntStream.iterate(n, i -> i - 1).limit(n).filter(i -> i % 2 != 0).sum();
        }
    }
}
