import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaxDoubleSliceSumTest {
    private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

    @Test
    public void should_Return0_When_123() {
        int[] array = {1, 2, 3};
        int expected = 0;
        int actual = maxDoubleSliceSum.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return8() {
        int[] array = {1, 2, 3, 5, 7};
        int expected = 8;
        int actual = maxDoubleSliceSum.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return10() {
        int[] array = {0, 10, -5, -2, 0};
        int expected = 10;
        int actual = maxDoubleSliceSum.solution(array);
        assertEquals(expected, actual);
    }
}
