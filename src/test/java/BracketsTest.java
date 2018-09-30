import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.*;

@TestInstance(Lifecycle.PER_CLASS)
public class BracketsTest {
    private Brackets brackets = new Brackets();

    @Test
    public void should_Return_1_When_Empty() {
        String s = "";
        int expected = 1;
        int actual = brackets.solution(s);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_ProperParenthesis() {
        String s = "()";
        int expected = 1;
        int actual = brackets.solution(s);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_ProperParenthesisMulti() {
        String s = "(()()(((()))))";
        int expected = 1;
        int actual = brackets.solution(s);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_FewerClosedParenthesisMulti() {
        String s = "(()()(((())))";
        int expected = 0;
        int actual = brackets.solution(s);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_MoreClosedParenthesisMulti() {
        String s = "(()()((()))))";
        int expected = 0;
        int actual = brackets.solution(s);
        assertEquals(expected, actual);
    }
}
