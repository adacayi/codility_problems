import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PeaksTest {
    private Peaks peaks = new Peaks();

    @Test
    public void should_Return0_When_NoPeaks() {
        int[] array = {3, 2, 1};
        int expected = 0;
        int actual = peaks.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_OnePeak() {
        int[] array = {3, 2, 1, 4, 3};
        int expected = 1;
        int actual = peaks.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return2_When_TwoPeak() {
        int[] array = {1, 2, 1, 4, 3, 2};
        int expected = 2;
        int actual = peaks.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return3() {
        int[] array = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int expected = 3;
        int actual = peaks.solution(array);
        assertEquals(expected, actual);
    }
}
