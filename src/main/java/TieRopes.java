public class TieRopes {
    public int solution(int k, int[] array) {
        int i, n = array.length, count = 0, sum = 0;
        for (i = 0; i < n; i++) {
            if ((sum = sum + array[i]) >= k) {
                sum = 0;
                count++;
            }
        }

        return count;
    }
}
