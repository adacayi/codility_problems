import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.*;

@TestInstance(Lifecycle.PER_CLASS)
public class MaxProfitTest {
    private MaxProfit maxProfit = new MaxProfit();

    @Test
    public void should_Return0_When_Empty() {
        int[] array = {};
        int expected = 0;
        int actual = maxProfit.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return0_When_NoProfit() {
        int[] array = {4, 3, 2, 1};
        int expected = 0;
        int actual = maxProfit.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return5() {
        int[] array = {4, 3, 2, 6, 3, 7};
        int expected = 5;
        int actual = maxProfit.solution(array);
        assertEquals(expected, actual);
    }
}
