import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    public void should_Return0_When_Empty() {
        int[] array = {};
        int expected = 0;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return0_When_2() {
        int[] array = {2};
        int expected = 0;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return0_When_00() {
        int[] array = {0, 0};
        int expected = 0;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }
    @Test
    public void should_Return6_When_10101() {
        int[] array = {1, 0, 1, 0, 1};
        int expected = 6;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return11_When_152140() {
        int[] array = {1, 5, 2, 1, 4, 0};
        int expected = 11;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }
    @Test
    public void should_Return5_When_1_10_100_1() {
        int[] array = {1, 10, 100, 1};
        int expected = 5;
        int actual = numberOfDiscIntersections.solution(array);
        assertEquals(expected, actual);
    }
}
