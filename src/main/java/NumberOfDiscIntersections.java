import java.util.Arrays;

public class NumberOfDiscIntersections {

    public static final int LIMIT = 10_000_000;

    public int solution(int[] array) {
        int i, j, n = array.length, count = 0;
        long[] begin = new long[n], end = new long[n];

        for (i = 0; i < n; i++) {
            begin[i] = i - (long) array[i];
            end[i] = i + (long) array[i];
        }

        Arrays.sort(begin);
        Arrays.sort(end);
        j = 0;

        for (i = 0; i < n; i++) {
            while (j < n && begin[j] <= end[i]) {
                count += j - i;

                if (count > LIMIT)
                    return -1;

                j++;
            }
        }

        return count;
    }
}
