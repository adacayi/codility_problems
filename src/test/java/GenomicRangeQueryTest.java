import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery=new GenomicRangeQuery();

    @Test
    public void should_Return3_When_CTGA_2_2() {
        String s="CTGA";
        int[] P = {2}, Q = {2};
        int[] expected = {3};
        int[] actual = genomicRangeQuery.solution(s, P, Q);
        Assertions.assertArrayEquals(expected,actual);
    }
}
