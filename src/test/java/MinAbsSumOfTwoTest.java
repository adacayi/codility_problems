import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinAbsSumOfTwoTest {
    private MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    @Test
    public void should_Return_2_When_1Element() {
        int[] array = {-2};
        int expected = 4;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_320345() {
        int[] array = {3, 2, 0, 3, 4, 5};
        int expected = 0;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_2_When_320345() {
        int[] array = {3, 2, 3, 4, 5};
        int expected = 4;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_4_When_Minus32345() {
        int[] array = {-3, -2, -3, -4, -5};
        int expected = 4;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_Minus54Plus325() {
        int[] array = {-5, -4, 3, 2, 5};
        int expected = 0;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_1_When_14Minus3() {
        int[] array = {1, 4, -3};
        int expected = 1;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_3() {
        int[] array = {-8, 4, 5, -10, 3};
        int expected = 3;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_2_When_Minus8_Plus12() {
        int[] array = {-8, 1, 2};
        int expected = 2;
        int actual = minAbsSumOfTwo.solution(array);
        assertEquals(expected, actual);
    }
}
