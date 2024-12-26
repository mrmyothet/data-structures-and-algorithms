package com.myothet.dsa.datastructure;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void Test_AddFirst() {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addFirst(first);

        Node second = new Node(20);
        list.addFirst(second);

        Iterator iterator = list.iterator();
        assertEquals(second, iterator.next());
        assertEquals(first, iterator.next());
    }

    @Test
    public void Test_AddFirst_Many() {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addFirst(first);

        Node second = new Node(20);
        list.addFirst(second);

        Node third = new Node(30);
        list.addFirst(third);

        Iterator iterator = list.iterator();

        assertEquals(third, iterator.next());
        assertEquals(second, iterator.next());
        assertEquals(first, iterator.next());
    }

    @Test
    public void Test_AddFirst_Iterate() {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.addFirst(new Node(i));
        }

        int i = 9;
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Node node = (Node) iterator.next();
            assertEquals(i--, node.getValue());
        }
    }

    @Test
    public void Test_AddLast() {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addLast(first);

        Node second = new Node(20);
        list.addLast(second);

        Iterator iterator = list.iterator();
        assertEquals(first, iterator.next());
        assertEquals(second, iterator.next());
    }

    @Test
    public void Test_AddLast_Many() {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addLast(first);

        Node second = new Node(20);
        list.addLast(second);

        Node third = new Node(30);
        list.addLast(third);

        Iterator iterator = list.iterator();

        assertEquals(first, iterator.next());
        assertEquals(second, iterator.next());
        assertEquals(third, iterator.next());
    }

    @Test
    public void Test_AddLast_Iterate() {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.addLast(new Node(i));
        }

        int i = 0;
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Node node = (Node) iterator.next();
            assertEquals(i++, node.getValue());
        }
    }

}
