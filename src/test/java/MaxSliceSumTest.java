import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaxSliceSumTest {
    private MaxSliceSum maxSliceSum = new MaxSliceSum();

    @Test
    public void should_Return3_When_3() {
        int[] array = {3};
        int expected = 3;
        int actual = maxSliceSum.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return6() {
        int[] array = {3, -4, 2, 4, -7, 5};
        int expected = 6;
        int actual = maxSliceSum.solution(array);
        assertEquals(expected, actual);
    }
}
