package com.myothet.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class QueueByLinkedListTest {

    QueueByLinkedList queue = new QueueByLinkedList();

    @Test
    public void testEnqueue() {

        queue.enqueue(100);
        int size = queue.size();

        assertEquals(1, size);
        assertEquals(100, queue.peek());
    }

    @Test
    public void testSize() {

        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);

        int size = queue.size();

        assertEquals(3, size);

        assertEquals(200, queue.peek());
    }

    @Test
    public void testDequeue() {

        queue.enqueue(200);

        int item = queue.dequeue();
        assertEquals(200, item);
    }

    @Test
    public void testDequeueTwo() {

        queue.enqueue(300);
        queue.enqueue(200);

        int item = queue.dequeue();
        assertEquals(300, item);

    }

    @Test
    public void testDequeueBoundry() {

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        assertEquals(10, queue.size());

        for (int i = 0; i < 10; i++) {
            int item = queue.dequeue();
            assertEquals(i, item);
        }
    }

    @Test
    public void testNormalQueueLimitation() {

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        assertEquals(10, queue.size());

        for (int i = 0; i < 10; i++) {
            int item = queue.dequeue();
            assertEquals(i, item);
        }
    }

    /*
    @Test
    public void testTailLessThanHead() {
        queue.enqueue(10);
        queue.enqueue(20);

        int item = queue.dequeue();
        queue.dequeue();

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            queue.dequeue();
        });

        assertEquals("Queue is empty", ex.getMessage());

        assertEquals(10, item);
    }
     */
}
