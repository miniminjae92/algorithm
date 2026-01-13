import java.util.Arrays;
import java.util.function.BiFunction;

class Solution {
        private enum Operator {
            PLUS("+", (a, b) -> a + b),
            MINUS("-", (a, b) -> a - b),
            MULTIPLY("*", (a, b) -> a * b),
            ;

            private final String symbol;
            private final BiFunction<Integer, Integer, Integer> expression;

            Operator(String symbol, BiFunction<Integer, Integer, Integer> expression) {
                this.symbol = symbol;
                this.expression = expression;
            }

            public static Operator from(String symbol) {
                return Arrays.stream(values())
                        .filter(operator -> operator.symbol.equals(symbol))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("[ERROR] 지원하지않는 연산자입니다."));
            }

            public int calculate(int a, int b) {
                return expression.apply(a, b);
            }
        }

        public int solution(String myString) {
            String[] parts = myString.split(" ");
            int firstOperand = Integer.parseInt(parts[0]);
            int secondOperand = Integer.parseInt(parts[2]);
            return Operator.from(parts[1]).calculate(firstOperand, secondOperand);
        }

}