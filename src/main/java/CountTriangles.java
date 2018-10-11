import java.util.Arrays;

public class CountTriangles {
    public int solution(int[] array) {
        int i, j, k, n = array.length, count = 0;

        if (n < 3)
            return 0;

        Arrays.sort(array);

        for (i = 0; i < n - 2; i++) {
            for (j = i + 1, k = i + 2; k < n; k++) {
                if (array[i] + array[j] > array[k])
                    count += k - j;// count of all triangles having the end side as array[k].
                    // They are triangles with middle side being a[j],a[j+1],..,a[k-1]
                else {
                    j++;

                    if (j < k) // if j<k array[i]+array[j] might be bigger than array[k] with the new j.
                        // So we decrease k to make the comparison.
                        k--;
                }
            }
        }

        return count;
    }
}
