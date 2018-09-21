public class BinaryGap {
    public int solution(int number) {
        char[] array = Integer.toString(number, 2).toCharArray();
        int i, begin = -1, max = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == '0')
                continue;

            if (begin >= 0)
                max = Math.max(max, i - begin - 1);

            begin = i;
        }

        return max;
    }
}
