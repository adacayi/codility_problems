public class CountDiv {
    public int solution(int a, int b, int k) {
        int begin = (int) Math.ceil(a / (double)k) * k;
        int end = (b / k) * k;

        if (begin > end)
            return 0;

        return (end - begin) / k + 1;
    }
}
