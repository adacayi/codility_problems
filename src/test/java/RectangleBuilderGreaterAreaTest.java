import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RectangleBuilderGreaterAreaTest {
    private RectangleBuilderGreaterArea rectangleBuilderGreaterArea = new RectangleBuilderGreaterArea();

    @Test
    public void should_Return_0() {
        assertEquals(0, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 3}, 4));
        assertEquals(0, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 3, 3}, 5));
        assertEquals(0, rectangleBuilderGreaterArea.solution(new int[]{3}, 5));
        assertEquals(0, rectangleBuilderGreaterArea.solution(new int[]{}, 5));
    }

    @Test
    public void should_Return_1() {
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 1, 1}, 1));
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 2, 2}, 1));
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 2, 2, 3, 5}, 1));
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{1, 1, 2, 2, 3, 5, 5}, 10));
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{3, 3, 3, 3, 5, 5}, 10));
        assertEquals(1, rectangleBuilderGreaterArea.solution(new int[]{1_000_000_000,1_000_000_000,1_000_000_000,1_000_000_000}, 10));
    }
}
