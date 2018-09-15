import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FrogJmpTest {
    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void should_Return2_When_152() {
        int x = 1, y = 5, d = 2;
        int expected = 2;
        int actual = frogJmp.solution(x, y, d);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should_Return2_When_142() {
        int x = 1, y = 4, d = 2;
        int expected = 2;
        int actual = frogJmp.solution(x, y, d);
        Assertions.assertEquals(expected, actual);
    }
}
