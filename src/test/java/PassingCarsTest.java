import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PassingCarsTest {
    private PassingCars passingCars = new PassingCars();

    @Test
    public void should_Return0_When_NoPassingCars() {
        int[] array = {1, 1, 0, 0};
        int expected = 0;
        int actual = passingCars.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_000_000_When_Exceeding() {
        int[] array = new int[100_000];
        for (int i = 50_000; i < array.length; i++)
            array[i] = 1;

        array[array.length - 1] = 1;
        int expected = -1;
        int actual = passingCars.solution(array);
        assertEquals(expected, actual);
    }

    @Test
    public void should_Return4_When_101001() {
        int[] array = {1, 0, 1, 0, 0, 1};
        int expected = 4;
        int actual = passingCars.solution(array);
        assertEquals(expected, actual);
    }
}
