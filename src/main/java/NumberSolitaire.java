import java.util.Deque;
import java.util.LinkedList;

public class NumberSolitaire {

    public static final int MOVE_SIZE = 6;

    public int solution(int[] a) {
        int i, n = a.length;
        Deque<Integer> previous = new LinkedList<>();
        previous.add(a[0]);

        for (i = 1; i < n; i++) {
            previous.addLast(findMax(previous) + a[i]);

            if (previous.size() == MOVE_SIZE + 1)
                previous.removeFirst();
        }

        return previous.getLast();
    }

    private static int findMax(Deque<Integer> deque) {
        int max = Integer.MIN_VALUE;
        if (deque == null || deque.isEmpty())
            return max;

        for (Integer value : deque)
            max = Math.max(max, value);

        return max;
    }
}
