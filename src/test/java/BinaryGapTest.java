import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeEach
    public void init() {
        binaryGap = new BinaryGap();
    }

    @AfterEach
    public void tearDown() {
        binaryGap = null;
    }

    @Test
    public void should_Return0_When_32() {
        int expected = 0;
        int actual = binaryGap.solution(32);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_5() {
        int expected = 1;
        int actual = binaryGap.solution(5);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return5_When_1041() {
        int expected = 5;
        int actual = binaryGap.solution(1041);
        assertEquals(expected, actual);
    }
    @Test
    public void should_Return28_When_1610612737() {
        int expected = 28;
        int actual = binaryGap.solution(1610612737);
        assertEquals(expected, actual);
    }
}
