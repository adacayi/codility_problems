import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountTrianglesTest {
    private CountTriangles countTriangles = new CountTriangles();

    @Test
    public void should_Return_0_When_Empty() {
        int[] array = {};
        int expected = 0;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_1Element() {
        int[] array = {3};
        int expected = 0;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_2Element() {
        int[] array = {3, 8};
        int expected = 0;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_NotPossible() {
        int[] array = {1, 3, 8};
        int expected = 0;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_331() {
        int[] array = {3, 3, 1};
        int expected = 1;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_4() {
        int[] array = {10, 2, 5, 1, 8, 12};
        int expected = 4;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_3() {
        int[] array = {3, 3, 5, 6};
        int expected = 3;
        int actual = countTriangles.solution(array);
        assertEquals(expected, actual);
    }
}
