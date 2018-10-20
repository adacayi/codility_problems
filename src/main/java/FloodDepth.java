public class FloodDepth {
    public int solution(int[] a) {
        int i, n = a.length, maxDepth = 0, beginHeight = 0, lowestHeight = 0, height, depth = 0;

        for (i = 0; i < n; i++) {
            height = a[i];

            if (height < lowestHeight)
                lowestHeight = height;
            else if (height < beginHeight)
                maxDepth = Math.max(maxDepth, height - lowestHeight);
            else {
                maxDepth = Math.max(maxDepth, beginHeight - lowestHeight);
                beginHeight = height;
                lowestHeight = height;
            }
        }

        return maxDepth;
    }
}
