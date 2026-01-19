import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (String row : picture) {
            StringBuilder buffer = new StringBuilder();
            for (char c : row.toCharArray()) {
            	buffer.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
               	answer.add(buffer.toString());
            }
        }
        return answer.stream()
            .toArray(String[]::new);
    }
}