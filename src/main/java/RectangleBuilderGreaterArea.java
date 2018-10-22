import java.util.Arrays;

public class RectangleBuilderGreaterArea {
    public int solution(int[] a, int x) {
        int i, j, n = a.length, count, last, val, index, needed, limit = 1_000_000_000;
        int[][] countArrayTemp = new int[n][], countArray;

        if (n < 4)
            return 0;

        Arrays.sort(a);
        countArrayTemp[0] = new int[]{a[0], 1};
        last = 1;

        for (i = 1; i < n; i++) {
            val = a[i];

            if (val == countArrayTemp[last - 1][0])
                countArrayTemp[last - 1][1]++;
            else
                countArrayTemp[last++] = new int[]{val, 1};
        }
        countArray = new int[last][];

        for (i = 0, j = 0; i < last; i++)
            if (countArrayTemp[i][1] > 1)
                countArray[j++] = countArrayTemp[i];

        count = 0;
        n = j;

        for (i = 0; i < n - 1; i++) {
            val = countArray[i][0];
            needed = (int) Math.ceil(x / (double) val);
            index = binarySearch(countArray, i + 1, n, needed);
            index = index < 0 ? ~index : index;
            count += n - index;

            if (val >= needed && countArray[i][1] > 3)
                count++;

            if (count > limit)
                return -1;
        }

        if (i < n && countArray[i][1] > 3 && countArray[i][0] >= Math.ceil(x / (double) countArray[i][0]))
            count++;

        return count > limit ? -1 : count;
    }

    private int binarySearch(int[][] a, int beginIndex, int endIndex, int key) {
        int low = beginIndex, high = endIndex - 1, mid, val;
        while (low <= high) {
            mid = (low + high) >>> 1;
            val = a[mid][0];
            if (key > val)
                low = mid + 1;
            else if (key < val)
                high = mid - 1;
            else
                return mid;
        }

        return ~low;
    }
}