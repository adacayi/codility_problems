public class MinPerimeterRectangle {
    public int solution(int a) {
        int i, sqrt = (int) Math.sqrt(a);

        for (i = sqrt; i > 0; i--)
            if (a % i == 0)
                return 2 * (i + a / i);

        return 0;
    }
}
