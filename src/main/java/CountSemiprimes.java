import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSemiprimes {
    public int[] solution(int n, int[] p, int[] q) {
        int i, j, sqrt, l, val = 0, multiplication, m = p.length;
        List<Integer> primes = new ArrayList<>(n / 2);
        List<Integer> semiprimes = new ArrayList<>(n);
        int[] result = new int[m];

        primes.add(2);

        for (i = 3; i <= n / 2; i++) {
            l = primes.size();
            sqrt = (int) Math.sqrt(i);

            for (j = 0; j < l; j++) {
                val = primes.get(j);

                if (val > sqrt || i % val == 0)
                    break;
            }

            if (val > sqrt || j == l)
                primes.add(i);
        }

        l = primes.size();

        for (i = 0; i < l; i++) {
            val = primes.get(i);

            for (j = i; j < l; j++) {
                multiplication = val * primes.get(j);

                if (multiplication > n)
                    break;

                semiprimes.add(multiplication);
            }
        }
        semiprimes.sort(Integer::compareTo);

        for (i = 0; i < m; i++) {
            int beginIndex = Collections.binarySearch(semiprimes, p[i]);
            int endIndex = Collections.binarySearch(semiprimes, q[i]);
            beginIndex = beginIndex < 0 ? ~beginIndex : beginIndex;
            if (endIndex < 0)
                result[i] = ~endIndex - beginIndex;
            else
                result[i] = endIndex - beginIndex + 1;
        }

        return result;
    }
}
