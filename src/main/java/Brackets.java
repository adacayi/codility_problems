import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public int solution(String s) {
        char k, v;
        char[] array = s.toCharArray();
        int i, n = array.length;
        Map<Character, Character> closures = new HashMap<>(3, 1);
        Stack<Character> stack = new Stack<>();
        closures.put('(', ')');
        closures.put('[', ']');
        closures.put('{', '}');

        for (i = 0; i < n; i++) {
            k = array[i];

            if (closures.containsKey(k))
                stack.push(k);
            else if (stack.empty() || !closures.containsKey(v = stack.pop()) || k != closures.get(v))
                return 0;
        }

        if (stack.empty())
            return 1;

        return 0;
    }
}
