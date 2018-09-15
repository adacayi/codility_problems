public class PermMissingElement {
    public int solution(int[] array) {
        int length = array.length;
        int[] values = new int[length + 2];

        for (int i = 0; i < length; i++) {
            values[array[i]] = 1;
        }

        for (int i = 1; i < length + 2; i++)
            if (values[i] == 0)
                return i;

        return 0;
    }
}
