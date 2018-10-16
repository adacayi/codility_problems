public class MaxNonoverlappingSegments {
    public int solution(int[] a, int[] b) {
        int i, n = a.length, count = 1, previous;

        if (n == 0)
            return 0;

        previous = b[0];

        for (i = 1; i < n; i++) {
            if (a[i] <= previous)
                continue;
            previous = b[i];
            count++;
        }

        return count;
    }
}
