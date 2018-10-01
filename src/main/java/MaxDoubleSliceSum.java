public class MaxDoubleSliceSum {
    public int solution(int[] array) {
        int i, n = array.length, max = 0;
        int[] sumsEnding = new int[n], sumsBeginning = new int[n];

        for (i = 2; i < n - 1; i++)
            sumsEnding[i] = Math.max(0, Math.max(sumsEnding[i - 1] + array[i - 1], array[i - 1]));
        for (i = n - 3; i > 0; i--)
            sumsBeginning[i] = Math.max(0, Math.max(sumsBeginning[i + 1] + array[i + 1], array[i + 1]));

        for (i = 1; i < n - 1; i++)
            max = Math.max(sumsBeginning[i] + sumsEnding[i], max);

        return max;
    }
}
