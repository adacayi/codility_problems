import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinMaxDivisionTest {
    private MinMaxDivision minMaxDivision = new MinMaxDivision();

    @Test
    public void should_Return_True_When_Divisible_1521222_3_6() {
        int[] array = {1, 5, 2, 1, 2, 2, 2};
        int k = 3, largeSum = 6;
        boolean expected = true;
        boolean actual = minMaxDivision.isDivisible(array, k, largeSum);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_False_When_Divisible_1521222_3_5() {
        int[] array = {1, 5, 2, 1, 2, 2, 2};
        int k = 3, largeSum = 5;
        boolean expected = false;
        boolean actual = minMaxDivision.isDivisible(array, k, largeSum);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_True_When_Divisible_6254_3_7() {
        int[] array = {6, 2, 5, 4};
        int k = 3, largeSum = 7;
        boolean expected = true;
        boolean actual = minMaxDivision.isDivisible(array, k, largeSum);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_False_When_Divisible_6254_3_6() {
        int[] array = {6, 2, 5, 4};
        int k = 3, largeSum = 6;
        boolean expected = false;
        boolean actual = minMaxDivision.isDivisible(array, k, largeSum);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_False_When_Divisible_53_3_2() {
        int[] array = {5, 3};
        int k = 3, largeSum = 2;
        boolean expected = false;
        boolean actual = minMaxDivision.isDivisible(array, k, largeSum);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_6_When_1521222_3() {
        int[] array = {1, 5, 2, 1, 2, 2, 2};
        int k = 3, m = 6;
        int expected = 6;
        int actual = minMaxDivision.solution(k, m, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_7_When_6254_3() {
        int[] array = {6, 2, 5, 4};
        int k = 3, m = 6;
        int expected = 7;
        int actual = minMaxDivision.solution(k, m, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_0_When_0_1() {
        int[] array = {0};
        int k = 1, m = 1;
        int expected = 0;
        int actual = minMaxDivision.solution(k, m, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_5_When_53_3() {
        int[] array = {5, 3};
        int k = 3, m = 5;
        int expected = 5;
        int actual = minMaxDivision.solution(k, m, array);
        assertEquals(expected, actual);
    }
}
