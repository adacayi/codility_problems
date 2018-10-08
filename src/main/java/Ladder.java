public class Ladder {
    public int[] solution(int[] a, int[] b) {
        int i, l = a.length,
                max = a[0], modulo = (1 << 30);
        for (i = 1; i < l; i++)
            max = Math.max(max, a[i]); // Finding the maximum element with stream
        // is slower than this. So we used this way.
        // stream way is  max = Arrays.stream(a).max().orElse(0);

        int[] fib = new int[max + 1];
        int[] result = new int[l];
        fib[0] = 1;
        fib[1] = 1;

        for (i = 2; i <= max; i++)
            fib[i] = (fib[i - 1] + fib[i - 2]) % modulo;

        for (i = 0; i < l; i++)
            result[i] = fib[a[i]] % (1 << b[i]);

        return result;
    }
}
