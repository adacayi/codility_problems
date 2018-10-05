import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChocolatesByNumbersTest {
    private ChocolateByNumbers chocolateByNumbers = new ChocolateByNumbers();

    @Test
    public void should_Return1_When_GCD_5_11() {
        int a = 5, b = 11;
        int expected = 1;
        int actual = chocolateByNumbers.gcd(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return2_When_GCD_4_6() {
        int a = 4, b = 6;
        int expected = 2;
        int actual = chocolateByNumbers.gcd(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return5_When_Solution_4_10() {
        int n = 10, m = 4;
        int expected = 5;
        int actual = chocolateByNumbers.solution(n, m);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return19683_When_Solution_WithLarge() {
        int n = 322486272, m = 268435456;
        int expected = 19683;
        int actual = chocolateByNumbers.solution(n, m);
        assertEquals(expected, actual);
    }
}
