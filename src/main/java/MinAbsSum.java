public class MinAbsSum {
    public int solution(int[] a) {
        int i, j, n = a.length, sum = 0, mid, max = -1, maxReached = 0, val;
        int[] count = new int[101], currentReaches;
        boolean[] reaches;

        for (i = 0; i < n; i++) {
            a[i] = Math.abs(a[i]);
            count[a[i]]++;
            max = Math.max(max, a[i]);
            sum += a[i];
        }

        mid = sum / 2;
        reaches = new boolean[mid + 1];
        reaches[0] = true;
        for (i = 1; i <= max; i++) {
            if ((val = count[i]) == 0)
                continue;

            currentReaches = new int[mid + 1];
            for (j = 0; j <= mid - i; j++)
                if (reaches[j])
                    currentReaches[j + i] = val;
                else if (currentReaches[j] > 1)
                    currentReaches[j + i] = Math.max(currentReaches[j + i], currentReaches[j] - 1);

            for (j = 1; j <= mid; j++)
                if (currentReaches[j] > 0) {
                    reaches[j] = true;
                    maxReached = Math.max(maxReached, j);
                }
        }

        return sum - 2 * maxReached;
    }
}
