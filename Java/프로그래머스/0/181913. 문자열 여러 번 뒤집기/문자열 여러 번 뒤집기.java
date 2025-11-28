class Solution {
  public String solution(String my_string, int[][] queries) {
    StringBuilder sb = new StringBuilder(my_string);

    for (int[] query : queries) {
      int s = query[0];
      int e = query[1];

      sb.replace(s, e + 1, new StringBuilder(sb.substring(s, e + 1)).reverse().toString());
    }

    return sb.toString();
  }
}

// import static org.assertj.core.api.Assertions.assertThat;
//
// import java.util.stream.Stream;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.Arguments;
// import org.junit.jupiter.params.provider.MethodSource;
//
// public class SolutionTest {
//
//    Solution solution = new Solution();
//
//    @ParameterizedTest(name = "{index}번째 케이스: {2}")
//    @MethodSource("provideCases")
//    void testSolution(String input, int[][] query, String expected) {
//        String actual = solution.solution(input, query);
//
//        assertThat(actual).isEqualTo(expected);
//    }
//
//    private static Stream<Arguments> provideCases() {
//        return Stream.of(
//                Arguments.of(
//                        "rermgorpsam",
//                        new int[][]{{2, 3}},
//                        "remrgorpsam"
//                ),
//                Arguments.of(
//                        "remrgorpsam",
//                        new int[][]{{0, 7}},
//                        "progrmersam"
//                ),
//                Arguments.of(
//                        "progrmersam",
//                        new int[][]{{5, 9}},
//                        "prograsremm"
//                ),
//                Arguments.of(
//                        "prograsremm",
//                        new int[][]{{6, 10}},
//                        "programmers"
//                )
//        );
//    }
// }

