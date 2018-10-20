import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FloodDepthTest {
    private FloodDepth floodDepth = new FloodDepth();

    @Test
    public void should_Return_Depth_When_Single_Surrounded() {
        assertEquals(2, floodDepth.solution(new int[]{5, 1, 3}));
        assertEquals(2, floodDepth.solution(new int[]{3, 1, 6}));
    }

    @Test
    public void should_Return_Depth_When_Multiple_Surrounded() {
        assertEquals(6, floodDepth.solution(new int[]{5, 1, 3,2,7,1,9}));
        assertEquals(5, floodDepth.solution(new int[]{1, 5, 6,2,4,3,1,8}));
    }

    @Test
    public void should_Return_Depth_When_Multiple_End_Lower() {
        assertEquals(7, floodDepth.solution(new int[]{5, 1, 3,2,7,1,9,1,8}));
        assertEquals(8, floodDepth.solution(new int[]{1, 5, 6,2,4,3,1,8,2,1,10,1,9}));
        assertEquals(6, floodDepth.solution(new int[]{20, 4, 10, 1, 3}));
    }
}
