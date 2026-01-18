import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> delete = Arrays.stream(delete_list)
            .boxed()
            .collect(Collectors.toSet());
        return Arrays.stream(arr)
            .filter(i -> !delete.contains(i))
            .toArray();
    }
}