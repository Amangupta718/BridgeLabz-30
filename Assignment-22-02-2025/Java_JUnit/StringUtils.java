package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean palindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
        System.out.println(palindrome("HiiH"));
        System.out.println(upperCase("hello"));
    }
}
class TestClass{
    StringUtils su = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleH", su.reverse("Hello"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(su.palindrome("HiiH"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", su.upperCase("hello"));
    }
}
