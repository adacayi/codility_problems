import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    public void should_Return2_When_1522() {
        int[] array = {1, 5, 2, 2};
        int expected = 2;
        int actual = minAvgTwoSlice.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return0_When_Minus11() {
        int[] array = {-1, 1};
        int expected = 0;
        int actual = minAvgTwoSlice.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return2_When_56349() {
        int[] array = {5, 6, 3, 4, 9};
        int expected = 2;
        int actual = minAvgTwoSlice.solution(array);
        assertEquals(expected, actual);
    }
}
