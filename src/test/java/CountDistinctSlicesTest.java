import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountDistinctSlicesTest {
    private CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

    @Test
    public void should_Return_1_When_222() {
        int[] array = {2, 2, 2};
        int m = 3;
        int expected = 3;
        int actual = countDistinctSlices.solution(m, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_123() {
        int[] array = {1, 2, 3};
        int m = 3;
        int expected = 6;
        int actual = countDistinctSlices.solution(m, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_Limit_When_Exceeds_Limit() {
        int[] array = new int[1000000];
        int m = array.length + 1;
        int expected = 1_000_000_000;

        for (int i = 0; i < array.length; i++)
            array[i] = i;

        int actual = countDistinctSlices.solution(m, array);
        assertEquals(expected, actual);
    }
}
