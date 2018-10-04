import java.util.ArrayList;
import java.util.List;

public class CountNonDivisible {
    public int[] solution(int[] array) {
        int i, n = array.length, val;
        int[] countMap = new int[100_001];
        int[] nonDivisorCount = new int[100_001];
        int[] result = new int[n];
        List<Integer> factors;

        for (i = 0; i < n; i++) {
            val = array[i];
            countMap[val]++;
            nonDivisorCount[val] = -1;
        }

        for (i = 0; i < n; i++) {
            val = array[i];

            if (nonDivisorCount[val] == -1) {
                factors = getFactors(val);

                for (int factor : factors)
                    result[i] -= countMap[factor];

                result[i] += n;
                nonDivisorCount[val] = result[i];
            } else
                result[i] = nonDivisorCount[val];

        }

        return result;
    }

    public List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int i, sqrt = (int) Math.sqrt(n);

        for (i = 1; i < sqrt; i++)
            if (n % i == 0) {
                factors.add(i);
                factors.add(n / i);
            }

        if (n % sqrt == 0) {
            factors.add(sqrt);
            if (sqrt * sqrt < n)
                factors.add(n / sqrt);
        }

        return factors;
    }
}
