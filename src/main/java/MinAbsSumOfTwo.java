import java.util.Arrays;

public class MinAbsSumOfTwo {
    public int solution(int[] array) {
        int n = array.length, head, min, tail, val;
        Arrays.sort(array);
        head = 0;
        tail = n - 1;
        min = Math.abs(array[head] + array[tail]);

        while (head <= tail) {
            val = array[head] + array[tail];
            min = Math.min(min, Math.abs(val));

            if (val < 0)
                head++;
            else
                tail--;
        }
        return min;
    }
}
