package Java_JUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParametirizedTesting {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(5));
    }
}
class ParametirizedTestingTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenTrue(int number) {
        assertTrue(ParametirizedTesting.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(ParametirizedTesting.isEven(number));
    }
}
