import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NailingPlanksTest {
    private NailingPlanks nailingPlanks = new NailingPlanks();

    @Test
    public void should_Return_Minus1_When_NotPossible() {
        int[] a = {2}, b = {4}, c = {8, 5, 1};
        int expected = -1;
        int actual = nailingPlanks.solution(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_3_When_1543() {
        int[] a = {2}, b = {4}, c = {1, 5, 4, 3};
        int expected = 3;
        int actual = nailingPlanks.solution(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_8() {
        int[] a = {12, 9, 5, 5, 0, 3}, b = {15, 10, 6, 9, 4, 7}, c = {11, 6, 5, 4, 7, 9, 10, 12, 15};
        int expected = 8;
        int actual = nailingPlanks.solution(a, b, c);
        assertEquals(expected, actual);
    }
}
