import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountSemiprimesTest {
    private CountSemiprimes countSemiprimes = new CountSemiprimes();

    @Test
    public void should_Return0_When23() {
        int[] p = {2}, q = {3};
        int n = 50;
        int[] expected = {0};
        int[] actual = countSemiprimes.solution(n, p, q);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return1_When24() {
        int[] p = {2, 2, 4, 4}, q = {4, 5, 4, 5};
        int n = 50;
        int[] expected = {1, 1, 1, 1};
        int[] actual = countSemiprimes.solution(n, p, q);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_Return1040() {
        int[] p = {1, 4, 16}, q = {26, 10, 20};
        int n = 26;
        int[] expected = {10, 4, 0};
        int[] actual = countSemiprimes.solution(n, p, q);
        assertArrayEquals(expected, actual);
    }
}
