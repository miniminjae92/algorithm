import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            res.add(my_string.substring(i));
        }

        Collections.sort(res);
        return res.toArray(new String[0]);
    }
}
