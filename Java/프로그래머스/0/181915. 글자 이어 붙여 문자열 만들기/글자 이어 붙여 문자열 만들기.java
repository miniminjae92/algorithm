class Solution {
  public String solution(String my_string, int[] index_list) {
    // StringBuilder sb = new StringBuilder();
    // index_list의 길이가 고정되어있기 때문에 resize 비용을 줄일 수 있다.
    StringBuilder sb = new StringBuilder(index_list.length);

    for (int i : index_list) {
      sb.append(my_string.charAt(i));
    }

    return sb.toString();
  }
}

// 테스트 코드
// import static org.assertj.core.api.Assertions.assertThat;
//
// import java.util.stream.Stream;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.Arguments;
// import org.junit.jupiter.params.provider.MethodSource;
//
// public class SolutionTest {
//
//     Solution solution = new Solution();
//
//     @DisplayName("글자 이어 붙여 문자열 만들기 테스트")
//     @ParameterizedTest(name = "{index} : {2}")
//     @MethodSource("provideArguments")
//     void testSolution(String myString, int[] index, String expected) {
//
//         String actual = solution.solution(myString, index);
//
//         assertThat(actual).isEqualTo(expected);
//
//         actual = solution.solution(myString, index);
//
//         assertThat(actual).isEqualTo(expected);
//     }
//
//     private static Stream<Arguments> provideArguments() {
//         return Stream.of(Arguments.of(
//                         "cvsgiorszzzmrpaqpe",
//                         new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7},
//                         "programmers"
//                 ),
//                 Arguments.of(
//                         "zpiaz",
//                         new int[]{1, 2, 0, 0, 3},
//                         "pizza"
//                 ));
//     }
// }
