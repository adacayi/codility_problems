import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void should_Return0_When_1() {
        int[] array = {1};
        int x = 1;
        int expected = 0;
        int actual = frogRiverOne.solution(x, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_3_And_1133231() {
        int[] array = {1,1,3,3,2,3,1};
        int x = 3;
        int expected = 4;
        int actual = frogRiverOne.solution(x, array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_ReturnMinus1_When_3_And_1133331() {
        int[] array = {1,1,3,3,3,3,1};
        int x = 3;
        int expected = -1;
        int actual = frogRiverOne.solution(x, array);
        assertEquals(expected, actual);
    }
}
