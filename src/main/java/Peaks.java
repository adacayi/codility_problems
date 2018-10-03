import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int solution(int[] array) {
        List<Integer> peaks = new ArrayList<>();
        int i, n = array.length, l, sqrt = (int) Math.sqrt(n), minSize;
        List<Integer> divisors = new ArrayList<>(sqrt);

        for (i = 1; i < n - 1; i++)
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                peaks.add(i);

        if (peaks.isEmpty())
            return 0;

        minSize = n / peaks.size();

        for (i = 1; i <= sqrt; i++) {
            if (n % i != 0)
                continue;

            if (i >= minSize && isSeparable(peaks, i, n)) {
                return n / i;
            }

            divisors.add(i);
        }

        if (sqrt * sqrt == n)
            i = divisors.size() - 2;
        else
            i = divisors.size() - 1;

        for (; i >= 0; i--) {
            l = n / divisors.get(i);

            if (l >= minSize && isSeparable(peaks, l, n))
                return n / l;
        }

        return 0;
    }

    private static boolean isSeparable(List<Integer> peaks, int size, int n) {
        int i, endIndex = 0, l = peaks.size(), pieceCount = n / size;

        for (i = 0; i < pieceCount; i++) {

            if (peaks.get(endIndex) / size > i)
                return false;

            endIndex = binarySearch(peaks, endIndex + 1, l, (i + 1) * size);

            if (endIndex < 0) {
                endIndex = ~endIndex;

                if (endIndex == l && i < pieceCount - 1)
                    return false;
            }
        }

        return true;
    }

    private static int binarySearch(List<Integer> list, int fromIndex, int toIndex, int key) {
        int low = fromIndex, high = toIndex - 1, mid, midVal;

        while (low <= high) {
            mid = (low + high) >>> 1;
            midVal = list.get(mid);

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }
}
