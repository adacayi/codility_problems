import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.TestInstance.*;

@TestInstance(Lifecycle.PER_CLASS)
public class MissingIntegerTest {
    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void should_Return1_When_AllAreNonPositive() {
        int[] array = {-2, 0, -4};
        int expected = 1;
        int actual = missingInteger.solution(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_1IsMissinig() {
        int[] array = {-2, 0, -4, 3, 2};
        int expected = 1;
        int actual = missingInteger.solution(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should_Return5_When_3214_2() {
        int[] array = {3,2,1,4,-2};
        int expected = 5;
        int actual = missingInteger.solution(array);
        Assertions.assertEquals(expected, actual);
    }
}
