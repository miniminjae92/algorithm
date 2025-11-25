package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
  public int solution(int a, int b, int c, int d) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>(List.of(a, b, c, d));
    for (Integer i : list) {
      /*
                map.compute(i, (k, v) -> v == null ? 1 : v + 1);
                단순 카운팅에는 merge 추천, 코드가 짧아진다.
                기존 put, get을 하는 것과의 차이점이 있는가?
                기존 put, get은 두 번 해시 탐색을 하는데 이것은 한 번만 해시 탐색을 한다.
                그리고 하나의 동작으로 실행하기 때문에 Atomic해서 동시성, 멀티스레드 환경에서 유리하다.
                int[] 배열에 sort를 하여 if, else if 식으로 풀어도 되지만 주사위가 많아지는 확장까지 생각해본다면 그 방법은 사용하기 힘들어진다.
                확장성을 생각한다면 map을 이용하는 것이 좋다.
      */

      map.merge(i, 1, Integer::sum);
    }
    // map.size() 반복 되기 때문에 변수 사용
    int size = map.size();
    if (size == 4) {
      //          return map.entrySet().stream().map(entry ->
      // entry.getKey()).min(Integer::compareTo).get();
      //            가장 작은 값을 찾는 것은 Collection이면 가능하다, map.keySet()도 Set이라는 컬렉션이므로 컬렉션 사용을 추천한다.
      return Collections.min(map.keySet());
    } else if (size == 3) {
      int ans = 1;
      for (Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
          ans *= entry.getKey();
        }
      }
      return ans;
    } else if (size == 2) {
      //          카운트 횟수가 1, 3으로 정해져 있기 때문에 두번의 stream 생성보다 containsValue를 추천한다.
      //            if (map.values().stream().anyMatch(v -> v != 2)) {
      //                int q = map.entrySet().stream().filter(entry -> entry.getValue() ==
      // 1).findAny().get().getKey();
      //                int r = map.entrySet().stream().filter(entry -> entry.getValue() ==
      // 3).findAny().get().getKey();
      if (map.containsValue(3)) {
        int q = 0, r = 0;
        // map의 size가 2개이므로 아래처럼 진행한다.
        for (Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() == 1) {
            q = entry.getKey();
          } else {
            r = entry.getKey();
          }
        }
        return (10 * r + q) * (10 * r + q);
      } else {
        //                Iterator<Integer> it = map.keySet().iterator();
        //                int q = it.next();
        //                int r = it.next();
        //                return (q + r) * Math.abs(q - r);
        List<Integer> keys = new ArrayList<>(map.keySet());
        int q = keys.get(0);
        int p = keys.get(1);
        return (p + q) * Math.abs(p - q);
      }
    } else {
      return 1111 * map.keySet().iterator().next();
    }
  }
}

// Test Code
// package codingtest;
//
// import static org.assertj.core.api.Assertions.assertThat;
//
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.CsvSource;
//
// public class SolutionTest {
//
//    Solution solution = new Solution();
//
//    @ParameterizedTest(name = "{index}번째 케이스: a={0}, b={1}, c={2}, d={3} -> 결과={4}")
//    @CsvSource({
//            "2, 2, 2, 2, 2222",
//            "4, 1, 4, 4, 1681",
//            "6	,3	,3	,6	,27",
//            "2,	5,	2,	6,	30",
//            "6,	4,	2,	5,	2"
//    })
//    void testSolution(int a, int b, int c, int d, int expected) {
//
//        int actual = solution.solution(a, b, c, d);
//
//        assertThat(actual).isEqualTo(expected);
//    }
// }
