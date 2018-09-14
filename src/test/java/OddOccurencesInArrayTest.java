import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurencesInArrayTest {
    private OddOccurencesInArray oddOccurencesInArray = new OddOccurencesInArray();

    @Test
    public void should_Return5_When_32523() {
        int[] array = {3, 2, 5, 2, 3};
        int expected = 5;
        int actual = oddOccurencesInArray.solution(array);
        assertEquals(expected, actual);
    }
}
