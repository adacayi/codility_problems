import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestPassword {
    public int solution(String message) {
        int max = -1, digitCount, letterCount;
        String wordPatternString = "[a-zA-Z\\d]+";
        Pattern letterPattern = Pattern.compile("[a-zA-Z]");
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher;
        Matcher letterMatcher;

        for (String word : message.split("\\s+")) {
            if (!word.matches(wordPatternString))
                continue;

            digitMatcher = digitPattern.matcher(word);
            for (digitCount = 0; digitMatcher.find(); digitCount++) ;

            if (digitCount % 2 == 0)
                continue;

            letterMatcher = letterPattern.matcher(word);
            for (letterCount = 0; letterMatcher.find(); letterCount++) ;

            if (letterCount % 2 == 1)
                continue;

            max = Math.max(max, word.length());
        }

        return max;
    }
}
