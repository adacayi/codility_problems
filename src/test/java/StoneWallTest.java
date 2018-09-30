import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StoneWallTest {
    private StoneWall stoneWall = new StoneWall();

    @Test
    public void should_Return1_When_AllAreSameHeight() {
        int[] h = {2, 2, 2, 2};
        int expected = 1;
        int actual = stoneWall.solution(h);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_AllAreIncreasingHeight() {
        int[] h = {2, 3, 4, 5};
        int expected = 4;
        int actual = stoneWall.solution(h);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_AllAreDecreasingHeight() {
        int[] h = {5, 4, 3, 2};
        int expected = 4;
        int actual = stoneWall.solution(h);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return5_When_VaryingHeights() {
        int[] h = {5, 4, 5, 5, 6, 7, 6};
        int expected = 5;
        int actual = stoneWall.solution(h);
        assertEquals(expected, actual);
    }
}
