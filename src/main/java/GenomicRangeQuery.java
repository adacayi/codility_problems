import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
    public int[] solution(String s, int[] p, int[] q) {
        Map<Character, Integer> map = new HashMap<>(4);
        char[] array = s.toCharArray();
        ArrayList<Integer>[] positions = new ArrayList[4];
        int a, b, i, k, m = p.length, beginPosition, endPosition;
        int[] result = new int[m];

        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);

        for (i = 0; i < positions.length; i++)
            positions[i] = new ArrayList<>();

        for (i = 0; i < array.length; i++)
            positions[map.get(array[i]) - 1].add(i);

        for (i = 0; i < m; i++) {
            a = p[i];
            b = q[i];

            for (k = 0; k < positions.length; k++) {
                beginPosition = Collections.binarySearch(positions[k], a);

                if (beginPosition >= 0)
                    break;

                endPosition = Collections.binarySearch(positions[k], b);

                if (endPosition >= 0)
                    break;

                beginPosition = ~beginPosition;
                endPosition = ~endPosition;

                if (endPosition > beginPosition)
                    break;
            }

            result[i] = k+1;
        }

        return result;
    }
}
