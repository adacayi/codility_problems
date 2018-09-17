public class PermCheck {
    public int solution(int[] A) {
        int[] numbers = new int[100_001];
        int i, number, n = A.length;

        for (i = 0; i < n; i++) {
            number = A[i];

            if (number > n)
                return 0;
            numbers[number]++;

            if (numbers[number] > 1)
                return 0;
        }

        return 1;
    }
}
