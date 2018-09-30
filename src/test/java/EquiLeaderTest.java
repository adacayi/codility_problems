import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.*;

@TestInstance(Lifecycle.PER_CLASS)
public class EquiLeaderTest {
    private EquiLeader equileader = new EquiLeader();

    @Test
    public void should_ReturnZero_When_NoEquileaderWithNoLeader() {
        int[] array = {3, 4, 4, 5};
        int expected = 0;
        int actual = equileader.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_ReturnZero_When_NoEquileaderWithLeader() {
        int[] array = {1, 1, 2, 1, 3};
        int expected = 0;
        int actual = equileader.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4() {
        int[] array = {1, 1, 2, 1, 1};
        int expected = 4;
        int actual = equileader.solution(array);
        assertEquals(expected, actual);
    }
}
