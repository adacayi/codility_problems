import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @BeforeAll
    public void initAll() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void should_Return231_When_123With2Rotation() {
        int[] array = {1, 2, 3};
        int rotation = 2;
        int[] expected = {2, 3, 1};
        int[] actual = cyclicRotation.solution(array, rotation);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return231_When_123With5Rotation() {
        int[] array = {1, 2, 3};
        int rotation = 5;
        int[] expected = {2, 3, 1};
        int[] actual = cyclicRotation.solution(array, rotation);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_ReturnEmpty_When_Empty() {
        int[] array = {};
        int rotation = 5;
        int[] expected = {};
        int[] actual = cyclicRotation.solution(array, rotation);
        assertArrayEquals(expected, actual);
    }
}
