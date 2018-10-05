public class CommonPrimeDivisors {

    private int gcd(int a, int b) {
        int c;

        while (b > 0) {
            c = b;
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