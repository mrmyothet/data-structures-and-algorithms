package com.myothet.dsa.datastructure;

import java.util.Iterator;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SortedListTest {

    SortedList list = new SortedList();

    @Test
    public void Test_SortedList_BaseCase() {

        list.add(10);
        list.add(5);

        Iterator iterator = list.iterator();
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());

    }

    @Test
    public void Test_SortedList_FirstInsert() {

        list.add(5);
        list.add(10);
        list.add(2);

        Iterator iterator = list.iterator();
        assertEquals(2, ((Node) iterator.next()).getValue());
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());

    }

    @Test
    public void Test_SortedList_LastInsert() {

        list.add(5);
        list.add(10);
        list.add(20);

        Iterator iterator = list.iterator();
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());
        assertEquals(20, ((Node) iterator.next()).getValue());

    }

    @Test
    public void Test_SortedList_MiddleInsert() {

        list.add(5);
        list.add(10);
        list.add(6);

        Iterator iterator = list.iterator();
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(6, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());

        assertFalse(iterator.hasNext());

    }

    @Test
    public void Test_SortedList_EqualCase() {

        list.add(5);
        list.add(10);
        list.add(10);
        list.add(5);
        list.add(6);

        Iterator iterator = list.iterator();
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(6, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());

        assertFalse(iterator.hasNext());

    }

    @Test
    public void Test_SortedList_Random() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int item = random.nextInt(100);
            list.add(item);
        }

        Iterator iterator = list.iterator();
        int previous = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            Node node = (Node) iterator.next();
            assertTrue(previous <= node.getValue());
            previous = node.getValue();

            System.out.println(node.getValue());
        }
    }
}
