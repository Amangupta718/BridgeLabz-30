package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideException {
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(20, 4));
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
class DivideExceptionTest {
    @Test
    void testDivide() {
        assertEquals(5, DivideException.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> DivideException.divide(5, 0));
    }
}
