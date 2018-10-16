import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TieRopesTest {
    private TieRopes tieRopes = new TieRopes();

    @Test
    public void should_Return_0() {
        assertEquals(0, tieRopes.solution(3, new int[]{1, 1}));
    }

    @Test
    public void should_Return_1() {
        assertEquals(1, tieRopes.solution(4, new int[]{1, 4, 3}));
    }
}
