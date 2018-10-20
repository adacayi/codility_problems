public class FloodDepth {
    public int solution(int[] a) {
        int i, n = a.length, maxDepth = 0, beginHeight = 0, height, depth = 0;

        // Searching for pools with right side higher.
        for (i = 0; i < n; i++) {
            height = a[i];

            if (height < beginHeight) {
                depth = Math.max(depth, beginHeight - height);
                continue;
            }

            maxDepth = Math.max(maxDepth, depth);
            beginHeight = height;
            depth = 0;
        }

        // Searching for pools with left side higher.
        beginHeight = 0;
        depth = 0;

        for (i = n - 1; i >= 0; i--) {
            height = a[i];

            if (height < beginHeight) {
                depth = Math.max(depth, beginHeight - height);
                continue;
            }

            maxDepth = Math.max(maxDepth, depth);
            beginHeight = height;
            depth = 0;
        }

        return maxDepth;
    }
}
