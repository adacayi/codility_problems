import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] array) {
        int i, n = array.length, current, count;

        Map<Integer, Integer> repetition = new HashMap<>((int) (array.length * 1.1), 1);

        for (i = 0; i < n; i++) {
            current = array[i];
            count = repetition.getOrDefault(current, 0) + 1;
            repetition.put(current, count);

            if (count > n / 2)
                return i;
        }

        return -1;
    }
}
