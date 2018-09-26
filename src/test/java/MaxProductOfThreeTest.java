import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaxProductOfThreeTest {
    private MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void should_Return90_When_5362() {
        int[] array = {5, 3, 6, 2};
        int expected = 90;
        int actual = maxProductOfThree.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return90_When_5362Minus10() {
        int[] array = {5, 3, 6, 2, -10};
        int expected = 90;
        int actual = maxProductOfThree.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return90_When_5362Minus10Minus2() {
        int[] array = {5, 3, 6, 2, -8, -1};
        int expected = 90;
        int actual = maxProductOfThree.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return120_When_5362Minus10Minus2() {
        int[] array = {5, 3, 6, 2, -10, -2};
        int expected = 120;
        int actual = maxProductOfThree.solution(array);
        assertEquals(expected, actual);
    }
}
