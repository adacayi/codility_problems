import java.util.Arrays;
import java.util.Comparator;

public class NumberOfDiscIntersections {

    public static final int LIMIT = 10_000_000;

    public int solution(int[] array) {
        int i, n = array.length, count = 0, lastIntersection = 0;
        long[][] beginArray;

        if (n < 2)
            return 0;

        beginArray = new long[n][2];

        for (i = 0; i < n; i++) {
            beginArray[i][0] = i - (long) array[i];
            beginArray[i][1] = i + (long) array[i];
        }

        Arrays.sort(beginArray, Comparator.comparingLong(x -> x[0]));

        for (i = 0; i < n - 1; i++) {
            if (i == 0 || beginArray[i - 1][1] < beginArray[i][1])
                lastIntersection = binarySearch(beginArray, lastIntersection,
                        n, beginArray[i][1]);
            else if (beginArray[i - 1][1] > beginArray[i][1])
                lastIntersection = binarySearch(beginArray, i + 1,
                        lastIntersection + 1, beginArray[i][1]);
            if (lastIntersection < 0)
                lastIntersection = ~lastIntersection - 1;

            count += lastIntersection - i;

            if (count > LIMIT)
                return -1;
        }

        return count;
    }

    private int binarySearch(long[][] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex, high = toIndex - 1, mid, result = -1;
        long midVal;

        while (low <= high) {
            mid = (low + high) >>> 1;
            midVal = a[mid][0];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                low = mid + 1;
                result = mid;
            }
        }

        if (result != -1)
            return result;

        return ~low;
    }
}
