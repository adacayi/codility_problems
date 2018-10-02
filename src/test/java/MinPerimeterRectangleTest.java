import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MinPerimeterRectangleTest {
    private MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();

    @Test
    public void should_Return4_When_Area1() {
        int a = 1;
        int expected = 4;
        int actual = minPerimeterRectangle.solution(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_Area16() {
        int a = 16;
        int expected = 16;
        int actual = minPerimeterRectangle.solution(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_Area15() {
        int a = 15;
        int expected = 16;
        int actual = minPerimeterRectangle.solution(a);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return2TimesPrimePlus1_When_HugePrime() {
        int a = 982_451_653;
        int expected = 2 * (a + 1);
        int[] actual = new int[1];
        LocalTime start = LocalTime.now();
        assertTimeout(Duration.ofMillis(100), () -> actual[0] = minPerimeterRectangle.solution(a));
        System.out.println(Duration.between(start, LocalTime.now()).toMillis());
        assertEquals(expected, actual[0]);
    }
}
