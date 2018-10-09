public class MinMaxDivision {
    public boolean isDivisible(int[] array, int k, int largeSum) {
        int i, n = array.length, count = 1, val, sum = 0;

        for (i = 0; i < n && count <= k; i++) {
            val = array[i];
            sum += val;

            if (sum <= largeSum)
                continue;

            if (val > largeSum)
                return false;

            count++;
            sum = val;
        }

        return count <= k;
    }

    public int solution(int k, int m, int[] array) {
        int n = array.length, low = 0, mid, high = m * (n / k + 1), result = -1, val;

        while (low <= high) {
            mid = (low + high) >>> 1;

            if (isDivisible(array, k, mid)) {
                result = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return result;
    }
}
