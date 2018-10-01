public class MaxSliceSum {
    public int solution(int[] array) {
        long previous, max;
        int i, n = array.length, current;
        previous = array[0];
        max = previous;

        for (i = 1; i < n; i++) {
            current = array[i];
            previous = Math.max(previous + current, current);
            max = Math.max(max, previous);
        }

        return (int) max;
    }
}
