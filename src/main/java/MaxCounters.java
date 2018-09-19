public class MaxCounters {
    public int[] solution(int n, int[] array) {
        int i, l = array.length, m, max = 0, base = 0;
        int[] result = new int[n];

        for (i = 0; i < l; i++) {
            m = array[i];

            if (m <= n) {
                if (result[m - 1] < base)
                    result[m - 1] = base + 1;
                else
                    result[m - 1]++;

                max=Math.max(max,result[m-1]);
            } else
                base = max;
        }

        for (i = 0; i < n; i++)
            if (result[i] < base)
                result[i] = base;

        return result;
    }
}
