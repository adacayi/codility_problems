import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class PermMissingElementTest {
    private PermMissingElement permMissingElement = new PermMissingElement();

    @Test
    public void should_Return2_When_431() {
        int[] array = {4, 3, 1};
        int expected = 2;
        int actual = permMissingElement.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When_Empty() {
        int[] array = {};
        int expected = 1;
        int actual = permMissingElement.solution(array);
        assertEquals(expected, actual);
    }
}
