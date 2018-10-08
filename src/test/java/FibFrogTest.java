import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FibFrogTest {
    private FibFrog fibFrog = new FibFrog();

    @Test
    public void should_Return_1_When_0() {
        int[] array = {};
        int expected = 1;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_4() {
        int[] array = {0, 0, 0, 0};
        int expected = 1;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_2_When_() {
        int[] array = {1, 1, 1, 1, 1};
        int expected = 2;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_Minus1_When_NoSolution() {
        int[] array = {0, 0, 0};
        int expected = -1;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_3_When_01010() {
        int[] array = {0, 1, 0, 1, 0};
        int expected = 3;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_0001() {
        int[] array = {0, 0, 0, 0, 1};
        int expected = 2;
        int actual = fibFrog.solution(array);
        assertEquals(expected, actual);
    }
}
