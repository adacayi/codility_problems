import java.util.Arrays;
import java.util.Comparator;

public class NailingPlanks {

    public int solution(int[] a, int[] b, int[] c) {
        int i, n = a.length, m = c.length, result = -1;
        int[][] orderedNails = new int[m][];

        for (i = 0; i < m; i++)
            orderedNails[i] = new int[]{c[i], i};

        Arrays.sort(orderedNails, Comparator.comparingInt(p -> p[0]));

        for (i = 0; i < n; i++) {
            result = binarySearchMinNailIndex(orderedNails, a[i], b[i], result);

            if (result == -1)
                return result;
        }

        return result + 1;
    }

    private int binarySearchMinNailIndex(int[][] orderedNails, int begin, int end, int previousMinNailIndex) {
        int i, m = orderedNails.length, low = 0, high = orderedNails.length - 1, min, mid, val, result = -1;

        while (low <= high) {
            mid = (low + high) >>> 1;
            val = orderedNails[mid][0];

            if (val >= begin) {
                high = mid - 1;

                if (val <= end)
                    result = mid;
            } else
                low = mid + 1;
        }

        if (result == -1)
            return -1;

        min = orderedNails[result][1];

        for (i = result; i < m && orderedNails[i][0] <= end
                && (min = Math.min(min, orderedNails[i][1])) > previousMinNailIndex; i++)
            ;

        return Math.max(min, previousMinNailIndex);
    }
}
