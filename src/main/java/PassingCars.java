public class PassingCars {
    public int solution(int[] array) {
        final int LIMIT = 1_000_000_000;
        int i;
        long count = 0, east = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                east++;
                continue;
            }
            count += east;

            if (count > LIMIT)
                return -1;
        }

        return (int) count;
    }
}
