import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LadderTest {
    private Ladder ladder = new Ladder();

    @Test
    public void shoud_Return_4_When_3_10() {
        int[] a = {3}, b = {10};
        int[] expected = {3};
        int[] actual = ladder.solution(a, b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoud_Return_5_When_4_10() {
        int[] a = {4}, b = {10};
        int[] expected = {5};
        int[] actual = ladder.solution(a, b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoud_Return_1_When_4_2() {
        int[] a = {4}, b = {2};
        int[] expected = {1};
        int[] actual = ladder.solution(a, b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoud_Return_In100ms_When_50_000() {
        int[] a = {50_000}, b = {30};
        assertTimeoutPreemptively(Duration.ofMillis(3000), () -> ladder.solution(a, b));
    }
}
