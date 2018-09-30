import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FishTest {
    private Fish fish = new Fish();

    @Test
    public void should_AllFishStayAlive_When_GoingUpDirection() {
        int[] a = {1, 4, 2, 3}, b = new int[4];
        int expected = 4;
        int actual = fish.solution(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_AllFishStayAlive_When_GoingDownDirection() {
        int[] a = {1, 4, 2, 3}, b = {1, 1, 1, 1};
        int expected = 4;
        int actual = fish.solution(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_1Eaten_Down() {
        int[] a = {1, 4, 2, 3}, b = {1, 0, 1, 1};
        int expected = 3;
        int actual = fish.solution(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_1Eaten_Up() {
        int[] a = {4, 1, 2, 3}, b = {1, 0, 1, 1};
        int expected = 3;
        int actual = fish.solution(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_3Eaten() {
        int[] a = {4, 1, 2, 3}, b = {1, 0, 1, 0};
        int expected = 1;
        int actual = fish.solution(a, b);
        assertEquals(expected, actual);
    }
}
