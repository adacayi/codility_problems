public class MaxProfit {
    public int solution(int[] array) {
        int i, n = array.length, min, max = 0, current;

        if (n == 0)
            return 0;

        min = array[0];

        for (i = 1; i < n; i++) {
            current = array[i];
            min = Math.min(min, current);
            max = Math.max(array[i] - min, max);
        }

        return max;
    }
}
