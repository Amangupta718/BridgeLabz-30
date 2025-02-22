package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {
    public static boolean ValidPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        System.out.println(ValidPassword("Bhagyodaya1"));
        System.out.println(ValidPassword("bhagyodaya"));
        System.out.println(ValidPassword("BHAGYODAYA"));
    }
}
class PasswordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.ValidPassword("Bhagyodaya1"));
        assertTrue(PasswordValidator.ValidPassword("Hii987"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.ValidPassword("bhagyodaya"));
    }
}