import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] array) {
        int n = array.length, negativeProduct, positiveProduct;
        Arrays.sort(array);
        positiveProduct = array[n - 3] * array[n - 2] * array[n - 1];
        negativeProduct = array[0] * array[1] * array[n - 1];
        return Math.max(positiveProduct, negativeProduct);
    }
}
