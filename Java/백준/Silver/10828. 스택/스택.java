import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Deque<Integer> stack = new ArrayDeque<>();
        int round = Integer.parseInt(input);
        int i = 0;
        while (i < round) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                stack.addLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                Integer value = stack.pollLast();
                if (value == null) {
                    value = -1;
                }
                System.out.println(value);
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                    i++;
                    continue;
                }
                System.out.println("0");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                    i++;
                    continue;
                }
                System.out.println(stack.getLast());
            }
            i++;
        }
    }
}
