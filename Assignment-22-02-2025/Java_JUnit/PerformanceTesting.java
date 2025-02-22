package Java_JUnit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

public class PerformanceTesting {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Done";
    }

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(longRunningTask());
        System.out.println("End");
    }
}
class PerformanceTestingTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() {
        assertEquals("Task Done", PerformanceTesting.longRunningTask());
    }
}
