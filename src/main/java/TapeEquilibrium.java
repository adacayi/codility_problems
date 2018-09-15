public class TapeEquilibrium {
    public int solution(int[] array) {
        int first, second, sum = 0, min;
        int i, l = array.length;

        for (i = 0; i < l; i++) {
            sum += array[i];
        }
        first = array[0];
        second = sum - first;
        min = Math.abs(first - second);

        for (i = 1; i < l - 1; i++) {
            first += array[i];
            second -= array[i];
            min = Math.min(Math.abs(first - second), min);
        }

        return min;
    }
}
