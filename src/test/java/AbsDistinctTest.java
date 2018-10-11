import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbsDistinctTest {
    private AbsDistinct absDistinc = new AbsDistinct();

    @Test
    public void should_Return_1_When_222() {
        int[] array = {2, 2, 2};
        int expected = 1;
        int actual = absDistinc.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_5_When_Minus775532Plus1235() {
        int[] array = {-7, -7, -5, -5, -3, -2, 1, 2, 3, 5};
        int expected = 5;
        int actual = absDistinc.solution(array);
        assertEquals(expected, actual);
    }
}
