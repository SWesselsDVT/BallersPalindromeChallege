import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Utils.readFileToList;

class PalindromeCheckerTest {

    private static final String FILENAME = "src/test/resources/testStrings.txt";

    @AfterAll
    static void testPalindromeOnDataset() {
        List<String> strings = new ArrayList(readFileToList(FILENAME));
        String password = strings.stream()
            .filter(string -> PalindromeChecker.checkForPalindrome(string))
            .collect(Collectors.toList()).get(0);
        System.out.println("The password to open the file on the desktop is: " + password);
    }

    @Test
    void testValidPalindrome() {
        String palindrome = "dGwRZffZRwGd";
        assertTrue(PalindromeChecker.checkForPalindrome(palindrome));
    }

    @Test
    void testInvalidPalindrome() {
        String palindrome = "dGwRZefZRwGd";
        assertFalse(PalindromeChecker.checkForPalindrome(palindrome));
    }

}