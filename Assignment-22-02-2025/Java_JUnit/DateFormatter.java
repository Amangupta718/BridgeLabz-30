package Java_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }

    public static void main(String[] args) {
        System.out.println(formatDate("2025-10-02"));
        try {
            System.out.println(formatDate("02-10-2025"));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
class DateFormatterTest {
    @Test
    void testValidDateFormat() {
        assertEquals("02-10-2025", DateFormatter.formatDate("2025-10-02"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("02-10-2025"));
    }
}
