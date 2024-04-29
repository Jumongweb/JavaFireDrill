import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void testThatStringIsPalindrome(){
        assertEquals("yes", Palindrome.isPalindrome("madam"));
    }

    @Test
    public void testThatStringIsAlsoPalindrome(){
        assertEquals("yes", Palindrome.isPalindrome("a"));
    }

    @Test
    public void testThatStringIsNotPalindrome(){
        assertEquals("no", Palindrome.isPalindrome("String"));
    }
    @Test
    public void testThatStringWillReturnYes(){
        assertEquals("yes", Palindrome.isPalindrome("aabbbbaa"));
    }


}