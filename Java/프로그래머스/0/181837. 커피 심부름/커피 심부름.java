import java.util.List;
import java.util.Arrays;

class Solution {
    enum Menu {
        AMERICANO(List.of("iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything"), 4_500),
        CAFELATTE(List.of("icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"), 5_000),
        ;
        
        private final List<String> names;
        private final int price;
        
        Menu(List<String> names, int price) {
            this.names = names;
            this.price = price;
        }
        
        public static int getPrice(String name) {
            return Arrays.stream(values())
                .filter(menu -> menu.names.contains(name))
                .findFirst()
                .map(menu -> menu.price)
                .orElse(0);
        }
    }
    public int solution(String[] order) {
        return Arrays.stream(order)
            .mapToInt(o -> Menu.getPrice(o))
            .sum();
    }
}