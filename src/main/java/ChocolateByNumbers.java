public class ChocolateByNumbers {
    public int gcd(int a, int b) {
        int c;

        while (b != 0) {
            a = a % b; // The greatest common divisor of a and b must also be the greatest common divisor of a%b and b.
            // We know that a%b is smaller than b. So the new a is smaller than b.
            // Hence we swap a and b, so that b is always smaller.
            c = b;
            b = a;
            a = c;
        }

        return a;
    }

    public int solution(int n, int m) {
        // Assume that the first encountered chocolate wrapper is at a (where a is in 0..n-1).
        // Let's say k is the times to move to eat the chocolate at a (so that we have a chocolate wrapper).
        // a= m*k (mod n). Let's say l is the times to move to come to "a" again. So a=(m*k+l*m)(mod n)
        // Hence m*k (mod n)=(m*k+l*m)(mod n). Hence l*m=0 (mod n). The least l satisfying this condition results to l*m
        // being the least number that n and m both divides
        // a.k.a the least common multiple of m and n. m*l=lcm(m,n).
        // So l= lcm(m,n)/m;
        // lcm(m,n)= m*n/gcd(m,n).
        // So l=n/gcd(m,n).
        int gcd = gcd(n, m);
        return n / gcd;
    }
}
