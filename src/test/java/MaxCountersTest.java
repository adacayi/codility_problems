import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaxCountersTest {
    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void should_Return321_When_123211() {
        int[] array = {1, 2, 3, 2, 1, 1};
        int[] expected = {3, 2, 1};
        int[] actual = maxCounters.solution(3, array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return334_When_12321143() {
        int[] array = {1, 2, 3, 2, 1, 1, 4, 3};
        int[] expected = {3, 3, 4};
        int[] actual = maxCounters.solution(3, array);
        assertArrayEquals(expected, actual);
    }
}
