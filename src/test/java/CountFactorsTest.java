import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountFactorsTest {
    private CountFactors countFactors = new CountFactors();

    @Test
    public void should_Return1_When_1() {
        int n = 1;
        int expected = 1;
        int actual = countFactors.solution(n);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return6_When_18() {
        int n = 18;
        int expected = 6;
        int actual = countFactors.solution(n);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return6_When_16() {
        int n = 16;
        int expected = 5;
        int actual = countFactors.solution(n);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return6_When_12() {
        int n = 12;
        int expected = 6;
        int actual = countFactors.solution(n);
        assertEquals(expected, actual);
    }
}
