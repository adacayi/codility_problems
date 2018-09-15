import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void should_Return3_When3() {
        int[] array = {3};
        int expected = 3;
        int actual = tapeEquilibrium.solution(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should_Return1_When113() {
        int[] array = {1,1,3};
        int expected = 1;
        int actual = tapeEquilibrium.solution(array);
        Assertions.assertEquals(expected, actual);
    }
}
