import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FlagsTest {
    private Flags flags = new Flags();

    @Test
    public void should_Return0_When_NoPeaks() {
        int[] array = {3, 4, 5};
        int expected = 0;
        int actual = flags.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_OnePeak() {
        int[] array = {3, 4, 2};
        int expected = 1;
        int actual = flags.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return3() {
        int[] array = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int expected = 3;
        int actual = flags.solution(array);
        assertEquals(expected, actual);
    }

}
