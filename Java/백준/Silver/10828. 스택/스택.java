import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder buffer = new StringBuilder();
        String input = br.readLine();
        Deque<Integer> stack = new ArrayDeque<>();
        int round = Integer.parseInt(input);
        for (int i = 0; i < round; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                stack.addLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                Integer value = stack.pollLast();
                buffer.append(value == null ? -1 : value).append("\n");
            } else if (command.equals("size")) {
                buffer.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                buffer.append(stack.isEmpty() ? "1" : "0").append("\n");
            } else if (command.equals("top")) {
                Integer value = stack.peekLast();
                buffer.append(value == null ? "-1" : value).append("\n");
            }
        }
        System.out.println(buffer);
    }
}
