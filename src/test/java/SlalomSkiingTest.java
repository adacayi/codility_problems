import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SlalomSkiingTest {
    private SlalomSkiing slalomSkiing = new SlalomSkiing();

    @Test
    public void should_Return_5_When_Max_Increasing_Sequence() {
        long[] a = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = slalomSkiing.findMaxIncreasingSequence(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_4_When_Max_Increasing_Sequence() {
        long[] a = {1, 3, 5, 2, 6, 1};
        int expected = 4;
        int actual = slalomSkiing.findMaxIncreasingSequence(a);
        assertEquals(expected, actual);
        assertEquals(expected, slalomSkiing.findMaxIncreasingSequence(new long[]{15, 13, 5, 7, 4, 10, 12}));
    }

    @Test
    public void should_Return_3_When_Max_Increasing_Sequence() {
        long[] a = {5, 6, 1, 2, 3};
        int expected = 3;
        int actual = slalomSkiing.findMaxIncreasingSequence(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_2_When_Max_Increasing_Sequence() {
        long[] a = {11, 6, 9, 3};
        int expected = 2;
        int actual = slalomSkiing.findMaxIncreasingSequence(a);
        assertEquals(expected, actual);
        assertEquals(expected, slalomSkiing.findMaxIncreasingSequence(new long[]{1, 4, 4, 3, 3}));
    }

    @Test
    public void should_Return_8_Max_Increasing_Sequence() {
        int[] a = {15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3};
        int expected = 8;
        int actual = slalomSkiing.solution(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return_5_When_Skiing() {
        int[] a = {5, 6, 1, 2, 3};
        int expected = 5;
        int actual = slalomSkiing.solution(a);
        assertEquals(expected, actual);
        assertEquals(expected, slalomSkiing.solution(new int[]{1, 2, 3, 4, 5}));
        assertEquals(expected, slalomSkiing.solution(new int[]{3, 1, 2, 4, 5}));
        assertEquals(expected, slalomSkiing.solution(new int[]{3, 4, 2, 1, 5}));
    }

    @Test
    public void should_Return_8_When_Skiing() {
        int[] a = {15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3};
        int expected = 8;
        int actual = slalomSkiing.solution(a);
        assertEquals(expected, actual);
    }
}
