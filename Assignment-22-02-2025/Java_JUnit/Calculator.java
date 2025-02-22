package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.subtract(10, 4));
        System.out.println(calc.multiply(6, 2));
        System.out.println(calc.divide(9, 3));
    }
}
class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() { assertEquals(5, calc.add(2, 3)); }

    @Test
    void testSubtract() { assertEquals(1, calc.subtract(4, 3)); }

    @Test
    void testMultiply() { assertEquals(6, calc.multiply(2, 3)); }

    @Test
    void testDivide() { assertEquals(2, calc.divide(6, 3)); }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
