import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
    public int solution(int[] array) {
        int leader = 0, i, n = array.length, current, count = 0, countLeft = 0, result = 0;

        Map<Integer, Integer> repetition = new HashMap<>((int) (array.length * 1.1), 1);

        for (i = 0; i < n; i++) {
            current = array[i];
            count = repetition.getOrDefault(current, 0) + 1;
            repetition.put(current, count);

            if (count > n / 2) {
                leader = current;
                break;
            }
        }

        if (i == n)
            return result;

        for (i++; i < n; i++)
            if (array[i] == leader)
                count++;

        for (i = 0; i < n - 1; i++) {
            if (array[i] == leader)
                countLeft++;

            if (countLeft > (i + 1) / 2 && count - countLeft > (n - i - 1) / 2)
                result++;
        }

        return result;
    }
}
