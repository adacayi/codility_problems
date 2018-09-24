public class MinAvgTwoSlice {
    public int solution(int[] array) {
        int i, n = array.length, minIndex = 0, previousSum = array[0] + array[1];
        int[] beginIndex = new int[n];
        double current, min = previousSum / 2., containing, notContaining;

        for (i = 2; i < n; i++) {
            containing = (previousSum + array[i]) / (double) ((i - beginIndex[i - 1]) + 1);
            notContaining = (array[i - 1] + array[i]) / 2.;

            if (containing < notContaining) {
                current = containing;
                beginIndex[i] = beginIndex[i - 1];
                previousSum = previousSum + array[i];
            } else {
                current = notContaining;
                beginIndex[i] = i - 1;
                previousSum = array[i - 1] + array[i];
            }

            if (current < min) {
                minIndex = beginIndex[i];
                min = current;
            }
        }
        return minIndex;
    }
}
