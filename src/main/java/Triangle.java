import java.util.Arrays;

public class Triangle {
    public int solution(int[] array) {
        int i, n = array.length;
        Arrays.sort(array);
        for (i = 0; i < n - 2; i++) {
            if ((long) array[i] + array[i + 1] > array[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
