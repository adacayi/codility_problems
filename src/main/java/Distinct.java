import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] array) {
        Set<Integer> set = new HashSet<>(array.length, 1);

        for (int anArray : array) {
            set.add(anArray);
        }

        return set.size();
    }
}
