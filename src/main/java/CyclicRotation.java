public class CyclicRotation {
    private static int final_id;
    private static final Object lock = new Object();

    private int id;

    {
        synchronized (lock) {
            id = ++final_id;
            System.out.println(id);
        }
    }

    public int[] solution(int[] array, int rotation) {
        if (array == null || array.length == 0)
            return array;

        int i, length = array.length;
        rotation = rotation % length;

        if (rotation == 0)
            return array;

        int[] result = new int[length];

        for (i = 0; i < length; i++)
            result[(i + rotation) % length] = array[i];

        return result;
    }
}
