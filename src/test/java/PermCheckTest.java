import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PermCheckTest {
    private PermCheck permCheck = new PermCheck();

    @Test
    public void should_Return1_When_1() {
        int[] array={1};
        int expected=1;
        int actual = permCheck.solution(array);
        assertEquals(expected,actual);
    }

    @Test
    public void should_Return1_When_3421() {
        int[] array={3,4,2,1};
        int expected=1;
        int actual = permCheck.solution(array);
        assertEquals(expected,actual);
    }

    @Test
    public void should_Return0_When_3423() {
        int[] array={3,4,2,3};
        int expected=0;
        int actual = permCheck.solution(array);
        assertEquals(expected,actual);
    }

    @Test
    public void should_Return0_When_2() {
        int[] array={2};
        int expected=0;
        int actual = permCheck.solution(array);
        assertEquals(expected,actual);
    }
}
