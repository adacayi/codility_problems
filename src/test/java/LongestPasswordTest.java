import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestPasswordTest {
    private LongestPassword longestPassword = new LongestPassword();

    @Test
    public void should_Return_Length_When_Valid() {
        assertEquals(5, longestPassword.solution("asdf2"));
        assertEquals(7, longestPassword.solution("aBBC232"));

    }

    @Test
    public void should_Return_Minus_1_When_Invalid() {
        assertEquals(-1, longestPassword.solution("asdf_2"));
        assertEquals(-1, longestPassword.solution("zaq!2#edc"));
        assertEquals(-1, longestPassword.solution("aBBC2322"));
        assertEquals(-1, longestPassword.solution("aBB232"));
        assertEquals(-1, longestPassword.solution("aBB2321"));
        assertEquals(-1, longestPassword.solution("aBB2321 324a"));
    }

    @Test
    public void should_Return_Length_When_Valid_Multi() {
        assertEquals(7, longestPassword.solution("+++ 88883aa"));
        assertEquals(7, longestPassword.solution("asdf2 3 88883aa"));
    }
}
