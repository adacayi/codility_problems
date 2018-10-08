import java.util.ArrayList;
import java.util.List;

public class FibFrog {
    public int solution(int[] array) {
        int i, j, l, n = array.length, count, next, val, result = -1;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);

        if (n == 0)
            return 1;

        for (i = 2; ; i++) {
            val = fibonacci.get(i - 1) + fibonacci.get(i - 2);

            if (val > n + 1)
                break;

            fibonacci.add(val);
        }

        l = fibonacci.size();

        for (i = -1; i < n; i++) {
            if (i != -1 && array[i] < 2)// array[i] will hold the minimum number of jumps + 1 to that position
                // if it is not 0 or 1.
                // +1 is required to get rid off the ambiguity if 1 is there is a leaf and we can't reach there or
                // we reach there with 1 jump.
                continue;

            count = i == -1 ? 1 : array[i];

            for (j = 0; j < l && (val = fibonacci.get(j)) + i < n; j++) {
                next = array[i + val];

                if (next == 1)
                    array[i + val] = count + 1;
                else
                    array[i + val] = Math.min(next, count + 1);// If it is 0, it will remain 0.
            }

            if (val + i == n)
                if (result == -1)
                    result = count;
                else
                    result = Math.min(result, count);
        }

        return result;
    }
}
