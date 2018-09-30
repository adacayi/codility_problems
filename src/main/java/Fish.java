import java.util.Stack;

public class Fish {
    public int solution(int[] a, int[] b) {
        Stack<Integer> downstream = new Stack<>();
        int i, n = a.length, eaten = 0, current;

        for (i = 0; i < n; i++) {
            current = a[i];

            if (b[i] == 1) {
                downstream.push(current);
                continue;
            }

            while (!downstream.empty() && downstream.peek() < current) {
                downstream.pop();
                eaten++;
            }

            if(!downstream.empty())
                eaten++;
        }

        return n - eaten;
    }
}
