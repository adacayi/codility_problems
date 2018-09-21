import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountDivTest {
    private CountDiv countDiv = new CountDiv();

    @Test
    public void should_Return0_When_357() {
        int a = 3, b = 5, k = 7;
        int expected = 0;
        int actual = countDiv.solution(a, b, k);
        assertEquals(expected, actual);
    }
    @Test
    public void should_Return1_When_354() {
        int a = 3, b = 5, k = 4;
        int expected = 1;
        int actual = countDiv.solution(a, b, k);
        assertEquals(expected, actual);
    }
    @Test
    public void should_Return1_When_444() {
        int a = 4, b = 4, k = 4;
        int expected = 1;
        int actual = countDiv.solution(a, b, k);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return2_When_273() {
        int a = 2, b = 7, k = 3;
        int expected = 2;
        int actual = countDiv.solution(a, b, k);
        assertEquals(expected, actual);
    }
}
