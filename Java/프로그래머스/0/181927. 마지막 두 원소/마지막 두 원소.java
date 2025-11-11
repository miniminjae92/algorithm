import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> numbers = new ArrayList<>(Arrays.stream(num_list).boxed().collect(Collectors.toList()));
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        if (last > before) {
            numbers.add(last - before);
        } else {
            numbers.add(last * 2);
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}


