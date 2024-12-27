package com.myothet.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StackByLinkedListTest {

    StackByLinkedList stack = new StackByLinkedList();

    @Test
    public void testPush() {

        int size = stack.size();
        stack.push(100);

        assertEquals(size + 1, stack.size());

        int element = stack.peek();
        assertEquals(100, element);
    }

    @Test
    public void testPushElement2() {

        int size = stack.size();
        stack.push(200);

        assertEquals(size + 1, stack.size());

        int element = stack.peek();
        assertEquals(200, element);
    }

    public void testPushMultipleElement() {
        stack.push(200);
        stack.push(300);
        assertEquals(2, stack.size());

        int element = stack.peek();
        assertEquals(300, element);
    }

    @Test
    public void testPop() {
        stack.push(100);

        int size = stack.size();
        int element = stack.pop();

        assertEquals(100, element);
        assertEquals(size - 1, stack.size());

    }

    @Test
    public void testpopTwo() {
        stack.push(100);
        stack.push(200);

        int element = stack.pop();

        assertEquals(200, element);

        int element2 = stack.pop();
        assertEquals(100, element2);

        int size = stack.size();
        assertEquals(0, size);
    }

}
