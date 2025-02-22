package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit");
        }
        System.out.println("User registered successfully");
    }

    public static void main(String[] args) {
        try {
            registerUser("Aman", "amangupta2923@gmail.com", "Pass@1234");
            registerUser("BAC", "bac@gmai.com", "Pass123");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Aman ", "amangupta2923@gmail.com", "Pass@1234"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "abc@gmail.com", "Pass1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Aman", "", "Pass@1234"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("ABCDE", "abc@gmail.com", ""));
    }
}
