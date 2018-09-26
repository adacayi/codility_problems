import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void should_Return0_When_235() {
        int[] array = {2, 3, 5};
        int expected = 0;
        int actual = triangle.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_432() {
        int[] array = {4, 3, 2};
        int expected = 1;
        int actual = triangle.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_12479() {
        int[] array = {1, 2, 4,7,9};
        int expected = 1;
        int actual = triangle.solution(array);
        assertEquals(expected, actual);
    }
}
