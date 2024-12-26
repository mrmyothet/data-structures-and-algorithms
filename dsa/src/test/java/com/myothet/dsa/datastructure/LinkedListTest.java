package com.myothet.dsa.datastructure;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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

    @Test
    public void Test_AddFirst_AddLast_MixedCall() {
        
        LinkedList list = new LinkedList();
        list.addFirst(new Node(10));
//        [10]
        list.addFirst(new Node(20));
//        [20, 10]
        list.addLast(new Node(30));
//        [20, 10, 30]
        list.addFirst(new Node(5));
//        [5,20,10,30]

        Iterator iterator = list.iterator();

        assertEquals(5, ((Node) iterator.next()).getValue());
        assertEquals(20, ((Node) iterator.next()).getValue());
        assertEquals(10, ((Node) iterator.next()).getValue());
        assertEquals(30, ((Node) iterator.next()).getValue());
    }

    @Test
    public void Test_Search() {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        Node item = list.find(10);

        assertEquals(10, item.getValue());

        assertEquals(20, ((Node) list.find(20)).getValue());
        assertEquals(30, ((Node) list.find(30)).getValue());
        assertEquals(40, ((Node) list.find(40)).getValue());

    }

    @Test
    public void Test_Search_NegativeCase() {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        Node item = list.find(100);

        assertNull(item);
        assertNull(list.find(200));

    }

    @Test
    public void Test_DeleteFirst_SingleItem() {

        LinkedList list = new LinkedList();

        list.addFirst(10);

        Node item = list.delete(10);
        assertEquals(10, item.getValue());

    }

    @Test
    public void Test_DeleteFirst_MultipleItem() {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
//        [10, 20, 30, 40]

        assertNotNull(list.find(10));

        Node item = list.delete(10);
        assertEquals(10, item.getValue());
//        
        Iterator iterator = list.iterator();
        assertEquals(10, ((Node) iterator.next()).getValue());
//        assertEquals(20, ((Node)iterator.next()).getValue());
//        assertEquals(20, ((Node)iterator.next()).getValue());

    }
}
