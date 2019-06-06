import java.util.stream.IntStream;

public class PalindromeChecker {
    /**
     * Todo: Complete the function body below:
     *
     * This function takes in a string as a parameter.
     *
     * Your job is to complete the function body with code that determines whether or not
     * the given string is a palindrome or not (See the definition of palindrome below).
     *
     * Once you have written the function, go to test\java\PalindromeCheckerTest.java and run the
     * tests (You can run all test by clicking the play icon (or check icon) next to the class definition.
     * If the test have run successfully, a password will be printed out to the console. Use this password
     * to open the file on the desktop for the next clue.
     *
     * palindrome (noun): a word, phrase, or sequence that reads the same backwards as forwards,
     * e.g. madam or nurses run
     */
    static boolean checkForPalindrome(String s) {
        return IntStream.range(0, s.length() / 2)
            .noneMatch(i -> s.charAt(i) != s.charAt(s.length() - i - 1));
    }
}
