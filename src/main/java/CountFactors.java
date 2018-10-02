public class CountFactors {
    public int solution(int n) {
        int i, count = 0, sqrt = (int) Math.sqrt(n);

        for (i = 1; i <= sqrt; i++)
            if (n % i == 0)
                count += 2;

        if (sqrt * sqrt == n)
            count--;

        return count;
    }
}
