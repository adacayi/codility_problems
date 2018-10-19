import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinAbsSumTest {
    private MinAbsSum minAbsSum = new MinAbsSum();

    @Test
    public void should_Return_0() {
        assertEquals(0, minAbsSum.solution(new int[]{3, 2, 1}));
        assertEquals(0, minAbsSum.solution(new int[]{1, 1, 1, 1}));
        assertEquals(0, minAbsSum.solution(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 4}));
        assertEquals(0, minAbsSum.solution(new int[]{5, 5, -5, -5, 4, -4, 4, 4, 4}));
    }

    @Test
    public void should_Return_1() {
        assertEquals(1, minAbsSum.solution(new int[]{1, 1, 1, 1, 1}));
        assertEquals(1, minAbsSum.solution(new int[]{3, 2, 4}));
        assertEquals(1, minAbsSum.solution(new int[]{1, 1, 1}));
        assertEquals(1, minAbsSum.solution(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 1}));
        assertEquals(1, minAbsSum.solution(new int[]{5, 5, -5, -5, 4, -4, 4, 4, 4, 1}));
    }

    @Test
    public void should_Return_2() {
        assertEquals(2, minAbsSum.solution(new int[]{3,1}));
    }
}
