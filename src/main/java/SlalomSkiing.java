import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlalomSkiing {
    /*
     * First we convert the problem to longest increasing sequence (LIS) problem.
     * Let's think about the flags in the track and mirror them with a mirror at the distance which is the maximum distant flag's distance + 1.
     * So if the problem is only one turn allowed, we can convert the problem to finding the longest increasing sequence in the combined points, original and the mirror.
     * But combining points must be done like this.
     * Let's add them together to an array called multiverse (multiple universe consisting of original points and mirrored ones).
     * Now for each point in the original universe first we add the mirror point and then the original one.
     * This is because since we will use largest increasing sequence in the multiverse, in (mirror-point , original point) couples, only one will be taken, since mirror-point > original-point.
     * If reversed both original point and mirror point will be included in the largest increasing sequence, which results in a larger sequence than the original sequence has.
     * So if we find the largest increasing sequence in the multiverse, we can translate that sequence to our original universe 1-1 with same length and it is a maximum one turn sequence.
     * Also for each maximum one turn sequence has an increasing sequence correspondence with same length in the multiverse.
     * So if we find the largest increasing sequence in the multiverse we find the solution for maximum one turn problem.
     * Now, adding another reflection to the mirror image will give us the solution for maximum 2 turn case.
     */
    public int solution(int[] a) {
        int i, n = a.length, val;
        long max = 0; // max should be long, else we would get int values with 2*max+val below which might be negative
        long[] b = new long[3 * n];

        for (i = 0; i < n; i++)
            max = Math.max(max, a[i]);

        max++;

        for (i = 0; i < n; i++) {
            val = a[i];
            b[3 * i] = 2 * max + val;
            b[3 * i + 1] = 2 * max - val;
            b[3 * i + 2] = val;
        }

        return findMaxIncreasingSequence(b);
    }

    public int findMaxIncreasingSequence(long[] a) {
        int i, n = a.length, index;
        long val;
        List<Long> maxIncreasing = new ArrayList<>(n);

        for (i = 0; i < n; i++) {
            val = a[i];
            index = Collections.binarySearch(maxIncreasing, val);
            index = index < 0 ? ~index : index;

            if (index == maxIncreasing.size())
                maxIncreasing.add(val);
            else
                maxIncreasing.set(index, val);
        }

        return maxIncreasing.size();
    }
}
