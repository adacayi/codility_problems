import java.util.ArrayList;
import java.util.List;

public class Flags {
    public int solution(int[] array) {
        List<Integer> peaks = new ArrayList<>();
        int i, n = array.length;

        for (i = 1; i < n - 1; i++)
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                peaks.add(i++);

        if (peaks.isEmpty())
            return 0;

        return binarySearch(peaks);
    }

    private int binarySearch(List<Integer> peaks) {
        long low = 1, high = peaks.size();
        int midVal, result = -1;

        while (low <= high) {
            midVal = (int) ((low + high) / 2);
            if (isValid(peaks, midVal)) {
                result = midVal;
                low = midVal + 1;
            } else
                high = midVal - 1;
        }

        if (result != -1)
            return result;

        return 0;
    }

    private boolean isValid(List<Integer> peaks, int flagCount) {
        int i, j, l = peaks.size(), flagPosition;

        for (i = 0, j = 0; i < flagCount - 1; i++) {
            flagPosition = peaks.get(j);

            while (++j < l && peaks.get(j) < flagPosition + flagCount) ;

            if (j == l)
                return false;
        }

        return true;
    }
}
