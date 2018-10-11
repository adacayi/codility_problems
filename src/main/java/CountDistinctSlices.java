public class CountDistinctSlices {
    public int solution(int m, int[] array) {
        int i, j = 0, n = array.length, count = 0, val, limit = 1_000_000_000;
        int[] repetition = new int[m + 1];
        for (i = 0; i < n; i++) {
            for (; j < n && repetition[(val = array[j])] == 0; j++)
                repetition[val] = 1;

            count += j - i;

            if (count >= limit)
                return limit;

            repetition[array[i]] = 0;
        }

        return count;
    }
}
