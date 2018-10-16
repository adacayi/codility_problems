import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberSolitaireTest {
    private NumberSolitaire numberSolitaire = new NumberSolitaire();

    @Test
    public void should_Return_Sum_When_All_NonNegative() {
        assertEquals(3, numberSolitaire.solution(new int[]{2, 1}));
        assertEquals(23, numberSolitaire.solution(new int[]{5, 3, 7, 2, 0, 6}));
    }

    @Test
    public void should_Return_1() {
        assertEquals(1, numberSolitaire.solution(new int[]{2, -1, -3, -1, -2, -6, -4, -3, -2, -1, -2, 1}));
    }
}
