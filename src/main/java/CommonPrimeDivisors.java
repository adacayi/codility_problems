public class CommonPrimeDivisors {

    private int gcd(int a, int b) {
        int c;

        while (b > 0) {
            c = b;
            // If b is not the smaller of the two, in the first iteration b = a%b will make b->a
            // and a = c will make a -> b.
            // Then in the continuing iterations since a % b is smaller than b, a-> b and b-> a%b and
            // b will remain the smaller of the two.
            // Since gcd of a and b is also gcd of a%b and b we can calculate it iteratively until a%b becomes 0.
            b = a % b;
            a = c;
        }

        return a;
    }

    public int solution(int[] a, int[] b) {
        int i, n = a.length, count = 0, gcd, x, y, remain, val;

        main:
        for (i = 0; i < n; i++) {
            x = a[i];
            y = b[i];
            gcd = gcd(x, y);
            remain = x / gcd;

            while (remain > 1) {
                if ((val = gcd(gcd, remain)) == 1)
                    continue main;
                remain /= val;
            }

            remain = y / gcd;

            while (remain > 1) {
                if ((val = gcd(gcd, remain)) == 1)
                    continue main;
                remain /= val;
            }

            count++;
        }
        return count;
    }
}