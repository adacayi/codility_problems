import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
    public int solution(int[] array) {
        int i, n = array.length;
        Set<Integer> set = new HashSet<>();

        for (i = 0; i < n; i++)
            set.add(Math.abs(array[i]));

        return set.size();
    }
}
