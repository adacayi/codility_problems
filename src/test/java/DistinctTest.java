import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DistinctTest {
    private Distinct distinct = new Distinct();

    @Test
    public void should_Return3_When_11232() {
        int[] array={1,1,2,3,2};
        int expected=3;
        int actual = distinct.solution(array);
        assertEquals(expected, actual);
    }
}
