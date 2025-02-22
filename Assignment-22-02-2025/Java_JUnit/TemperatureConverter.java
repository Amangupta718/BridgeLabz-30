package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(55));
        System.out.println(fahrenheitToCelsius(50));
    }
}
class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(131.0, TemperatureConverter.celsiusToFahrenheit(55), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(10.0, TemperatureConverter.fahrenheitToCelsius(50), 0.01);
    }
}
