import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountNonDivisibleTest {
    private CountNonDivisible countNonDivisible = new CountNonDivisible();

    @Test
    public void should_Return0_When_OneElementArray() {
        int[] array = {3};
        int[] expected = {0};
        int[] actual = countNonDivisible.solution(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return000_When_AllAreSame() {
        int[] array = {2, 2, 2};
        int[] expected = {0, 0, 0};
        int[] actual = countNonDivisible.solution(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return4413551() {
        int[] array = {3, 2, 6, 4, 1, 1, 6};
        int[] expected = {4, 4, 1, 3, 5, 5, 1};
        int[] actual = countNonDivisible.solution(array);
        assertArrayEquals(expected, actual);
    }
}
