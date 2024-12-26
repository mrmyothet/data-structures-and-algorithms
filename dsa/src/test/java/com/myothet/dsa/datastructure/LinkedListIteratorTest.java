package com.myothet.dsa.datastructure;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListIteratorTest {

    @Test
    public void TestIterator() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.setNext(second);
        second.setNext(third);

        LinkedList list = new LinkedList();

        list.addFirst(first);

        Iterator iterator = list.iterator();

        assertEquals(first, iterator.next());
        assertEquals(second, iterator.next());
        assertEquals(third, iterator.next());

        // first, second, third 
    }
}
