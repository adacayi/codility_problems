import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaxNonoverlappingSegmentsTest {
    private MaxNonoverlappingSegments maxNonoverlappingSegments = new MaxNonoverlappingSegments();

    @Test
    public void should_Return_0_When_Empty() {
        assertEquals(0, maxNonoverlappingSegments.solution(new int[0], new int[0]));
    }

    @Test
    public void should_Return_1() {
        assertEquals(1, maxNonoverlappingSegments.solution(new int[]{1, 0, 3}, new int[]{7, 7, 8}));
        assertEquals(1, maxNonoverlappingSegments.solution(new int[]{3, 2, 1}, new int[]{6, 6, 6}));
    }

    @Test
    public void should_Return_3() {
        assertEquals(3, maxNonoverlappingSegments.solution(
                new int[]{1, 0, 3, 8, 9, 12, 15},
                new int[]{7, 7, 8, 12, 13, 14, 15}));
    }
}
