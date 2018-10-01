import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DominatorTest {
    private Dominator dominator = new Dominator();

    @Test
    public void shoud_ReturnMinus1_When_NoDominator() {
        int[] array = {2, 3, 4, 2};
        int expected = -1;
        int actual = dominator.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void shoud_Return6() {
        int[] array = {2, 3, 4, 2, 3, 3, 3};
        int expected = 6;
        int actual = dominator.solution(array);
        assertEquals(expected, actual);
    }
}
