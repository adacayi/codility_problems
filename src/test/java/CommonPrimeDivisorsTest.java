import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CommonPrimeDivisorsTest {
    private CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();

    @Test
    public void should_Return_0_When_solution_4_9() {
        int[] a = {4}, b = {9};
        int expected = 0;
        int actual = commonPrimeDivisors.solution(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_solution_12_18() {
        int[] a = {12}, b = {18};
        int expected = 1;
        int actual = commonPrimeDivisors.solution(a, b);
        assertEquals(expected, actual);
    }
}
