package Java_JUnit;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addElement(list, 30);
        addElement(list, 40);
        addElement(list, 10);

        System.out.println(list);
        System.out.println("Size: " + getSize(list));

        removeElement(list, 40);
        System.out.println(list);
        System.out.println("Size: " + getSize(list));
    }
}
class ListManagerTest {
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        ListManager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 25);
        ListManager.addElement(list, 45);
        assertEquals(2, ListManager.getSize(list));

        ListManager.removeElement(list, 25);
        assertEquals(2, ListManager.getSize(list));
    }
}
