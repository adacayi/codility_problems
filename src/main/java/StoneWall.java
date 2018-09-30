import java.util.Stack;

public class StoneWall {
    public int solution(int[] h) {
        Stack<Integer> blocks = new Stack<>();
        int i, n = h.length, current, last, count = 0;

        for (i = 0; i < n; i++) {
            current = h[i];

            while (!blocks.empty() && blocks.peek() > current) {
                blocks.pop();
            }
            if (!blocks.empty() && blocks.peek() == current)
                continue;
            blocks.add(current);
            count++;
        }

        return count;
    }
}
